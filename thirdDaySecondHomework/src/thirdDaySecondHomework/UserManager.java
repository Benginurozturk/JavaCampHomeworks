package thirdDaySecondHomework;

public class UserManager {

	public void logIn(User user)
	{
		System.out.println("Kullanýcý Adý : " + user.getUserName());
		System.out.println("Hoþgeldiniz :*)");
	}
	
	public void add(User user)
	{
		System.out.println(user.getUserName() + "Eklendi");
	}

	public void update(User user)
	{
		System.out.println(user.getUserName() + " güncellendi.");
	}	
}
