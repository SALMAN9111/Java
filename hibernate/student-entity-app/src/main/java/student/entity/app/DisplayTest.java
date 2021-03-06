package student.entity.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DisplayTest {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		org.hibernate.Query query = session.createQuery("from Student");
		java.util.List<Student> studentList = query.list();
		for (Student student : studentList) {
			System.out.println(student.getId());
			System.out.println(student.getFirstName());
			System.out.println(student.getLastName() + "\n--------");
		}
		session.close();
	}

}
