package student.entity.app;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	
	private String firstName;
	private String lastName;
	
	public Student() {}

	public Student(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}

	
	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
