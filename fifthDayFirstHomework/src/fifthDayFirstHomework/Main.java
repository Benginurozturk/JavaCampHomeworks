package fifthDayFirstHomework;

import fifthDayFirstHomework.business.abstracts.UserService;
import fifthDayFirstHomework.business.concretes.UserManager;
import fifthDayFirstHomework.business.concretes.VerificationManager;
import fifthDayFirstHomework.core.concretes.GoogleManager;
import fifthDayFirstHomework.core.concretes.MainAdapter;
import fifthDayFirstHomework.dataAccess.concretes.DatabaseUserDao;
import fifthDayFirstHomework.entities.concretes.User;

public class Main {
	
	public static void main(String[] args) {

	User benginur = new User("Benginur","Ozturk","benginur@benginur.com","123456") ;	
	UserService userService = new UserManager(new VerificationManager(),new DatabaseUserDao(), new MainAdapter());
	userService.register(benginur);
	System.out.println("///");
	userService.login(benginur.getEmail(), benginur.getPassword());
	
	System.out.println("***************************");
	

	User busra = new User("Busra","Yilmaz","busra@gmail.com","45678") ;
	UserService userService1 = new UserManager(new VerificationManager(),new DatabaseUserDao(), new GoogleManager());
	userService1.register(busra);
	System.out.println("///");
	userService1.login(busra.getEmail(), busra.getPassword());
	
	
	System.out.println("***************************");
	
	
	User kubra = new User("Kubra","Ozturk","kubra@gmail.com","159357") ;
	UserService userService2 = new UserManager(new VerificationManager(),new DatabaseUserDao(), new GoogleManager());
	userService2.register(kubra);
	System.out.println("///");
	userService2.login("abc", "4343434334");
	
	System.out.println("****************************");
	
	//Yanlis sekilde girilen email
	User arzu = new User("Arzu","Safak","ca2dfrt","456654") ;
	UserService userService3 = new UserManager(new VerificationManager(),new DatabaseUserDao(), new GoogleManager());
	userService3.register(arzu);
	System.out.println("///");
	userService3.login(arzu.getEmail(), arzu.getPassword());
	
	System.out.println("****************************");
	
	//Girilen ayný mail
	User deniz = new User("Deniz","Duran","deniz@hotmail.com","489632") ;
	UserService userService4 = new UserManager(new VerificationManager(),new DatabaseUserDao(), new GoogleManager());
	userService4.register(deniz);
	System.out.println("///");
	userService4.login(deniz.getEmail(), deniz.getPassword());
	
	
	

}
}

