package thirdDaySecondHomework;

public class StudentManager extends UserManager{

	public void add(Student student)
	{
		System.out.println(student.getFirstName() + " " + student.getLastName() + " Eklendi");
	}
	
	public void logIn(Student student)
	{
		System.out.println(student.getFirstName() + " " + student.getLastName() + " Hoþgeldiniz :*)");
	}
}
