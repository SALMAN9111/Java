package com.monocept.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.monocept.model.Actor;
import com.monocept.model.Movie;

public class ManytoManyTest {

  public static void main(String[] args) {
    Actor actor1 = new Actor(101, "Paul Walker");
    Actor actor2 = new Actor(102, "Vin Diesel");

    Movie movie1 = new Movie(1, "Fast And Furious");
    Movie movie2 = new Movie(2, "Brick Mension");

    movie1.getActors().add(actor1);
    movie1.getActors().add(actor2);
    movie2.getActors().add(actor1);

    actor1.getMovies().add(movie1);
    actor1.getMovies().add(movie2);
    actor2.getMovies().add(movie1);

    Configuration cfg = new Configuration();
    SessionFactory factory = cfg.configure().buildSessionFactory();

    Session session = factory.openSession();
    Transaction txn = session.beginTransaction();
    try {
      session.save(movie1);
      session.save(movie2);
      session.save(actor1);
      session.save(actor2);
      txn.commit();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      session.close();
      factory.close();
    }

  }

}