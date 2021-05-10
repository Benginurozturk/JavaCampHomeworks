package thirdDaySecondHomework;

public class Instructor extends User{

	String firstName;
	String lastName;
	String certificate;
	
	public Instructor(int id, String userName, String password, String firstName, String lastName, String certificate) {
		super(id, userName, password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.certificate = certificate;
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

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
}
