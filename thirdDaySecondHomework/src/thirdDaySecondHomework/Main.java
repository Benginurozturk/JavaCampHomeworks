package thirdDaySecondHomework;

public class Main {

	public static void main(String[] args) {
		Student student = new Student(1, "Öğrenci","123" , "Benginur", "Öztürk", "Konya Teknik Üniversitesi" ,"benginur@hotmail.com");
		
		
		Instructor instructor = new Instructor(2, "Öğretmen", "789", "Engin", "Demiroğ", "-");
		
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
