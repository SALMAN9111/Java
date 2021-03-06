package com.monocept.test;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.monocept.model.Department;
import com.monocept.model.Employee;


public class DisplayDetailsTest {

  public static void main(String[] args) {
    Configuration cfg = new Configuration();
    SessionFactory factory = cfg.configure().buildSessionFactory();

    Session session = factory.openSession();

    Query q = session.createQuery("from Employee e inner join e.dept");
    List<Object[]> listResult = q.list();
    for (Object[] list : listResult) {
      Employee e = (Employee) list[0];
      Department d = (Department) list[1];
      System.out.println("\nEmployee name :" 
      + e.getEname() + " Dept name : " + d.getDname());

    }
    session.close();
    factory.close();

  }
}