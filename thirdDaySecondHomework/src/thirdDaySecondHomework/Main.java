package thirdDaySecondHomework;

public class Main {

	public static void main(String[] args) {
		Student student = new Student(1, "��renci","123" , "Benginur", "�zt�rk", "Konya Teknik �niversitesi" ,"benginur@hotmail.com");
		
		
		Instructor instructor = new Instructor(2, "��retmen", "789", "Engin", "Demiro�", "-");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.logIn(student);
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.logIn(instructor);
		
		
		
		UserManager userManager = new UserManager();
		userManager.logIn(instructor);
		userManager.logIn(student);
		

	}

}
