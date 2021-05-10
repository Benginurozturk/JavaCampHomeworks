package thirdDaySecondHomework;

public class Student extends User{
	
	private String firstName;
	private String lastName;
	private String school;
	private String email;
	
	public Student(int id, String userName, String password, String firstName, String lastName, String school,String email) {
		super(id, userName, password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.school = school;
		this.email=email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
}

	
