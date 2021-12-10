package student.entity.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction t= session.beginTransaction();
		
		Student student = (Student)session.get(Student.class,101);
		student.setFirstName("Salman");
		student.setLastName("Burkaposh");
		t.commit();
		session.close();
	}

}
