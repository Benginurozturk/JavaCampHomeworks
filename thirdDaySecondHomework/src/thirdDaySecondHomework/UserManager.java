package thirdDaySecondHomework;

public class UserManager {

	public void logIn(User user)
	{
		System.out.println("Kullan�c� Ad� : " + user.getUserName());
		System.out.println("Ho�geldiniz :*)");
	}
	
	public void add(User user)
	{
		System.out.println(user.getUserName() + "Eklendi");
	}

	public void update(User user)
	{
		System.out.println(user.getUserName() + " g�ncellendi.");
	}	
}
