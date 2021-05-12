package fifthDayFirstHomework.business.concretes;

import fifthDayFirstHomework.business.abstracts.UserService;
import fifthDayFirstHomework.business.abstracts.VerificationService;
import fifthDayFirstHomework.core.abstracts.RegisterService;
import fifthDayFirstHomework.dataAccess.abstracts.UserDao;
import fifthDayFirstHomework.entities.concretes.User;

public class UserManager implements UserService {

	private VerificationService verificationService;
	private UserDao userDao;
	private RegisterService registerService;

	
	public UserManager(VerificationService verificationService, UserDao userDao, RegisterService registerService) {
		super();
		this.verificationService = verificationService;
		this.userDao = userDao;
		this.registerService = registerService;


	}
	

	@Override
	public void register(User user) {
		
		
		if (verificationService.userEmailControl(user.getEmail()) 
			&& verificationService.userNameControl(user.getName())
			&& verificationService.userSurnameControl(user.getLastName())
			&& verificationService.userPasswordControl(user.getPassword())
			){
			
			userDao.add(user);
			registerService.register(user);
			
			System.out.println("Email dogrulamasi icin lutfen emailinizi kontol ediniz. " + user.getEmail());

			System.out.println("Kayit basarili,Hosgeldiniz :*");
			
	
		}
		
	}

	@Override
	public void login(String email,String password) {
		
		for(int i = 0; i<userDao.getAll().size(); i++) {
			if (userDao.getAll().get(i).getEmail().equals(email) && userDao.getAll().get(i).getPassword().equals(password)) {
				System.out.println("Sisteme giris yaptiniz tebrikler :*");
				return;
			}
			
			System.out.println("Sifren veya emailin yanlis bir daha kontrol et");
			
		}
	}
}
