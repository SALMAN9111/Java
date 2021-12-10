package student.entity.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

  public static void main(String[] args) {
    Configuration cfg = new Configuration();
    SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
    System.out.println(sessionFactory.getClass());

    Session session = sessionFactory.openSession();
    System.out.println(session.getClass());
    
    Student s1= new Student(101, "sayed", "salman");
    Student s2= new Student(102, "Aditya", "Rugle");
    
    Transaction txn = session.beginTransaction();
    
    try {
      session.save(s1);
      session.save(s2);
      
      txn.commit();
    } catch (Exception e) {
      e.printStackTrace();
    }
    finally {
      session.close();
      sessionFactory.close();
    }
    
    
    
  }

}