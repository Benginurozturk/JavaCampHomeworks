package fifthDayFirstHomework.business.concretes;



import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fifthDayFirstHomework.business.abstracts.VerificationService;
import fifthDayFirstHomework.entities.concretes.User;

public class VerificationManager implements VerificationService {
	
	public List<User> users=new ArrayList<User>();
	String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

	@Override
	public boolean userNameControl(String username) {
		
		if (username.length() > 2) {
			return true;
		}
		else {
			System.out.println("Ýsminiz en az 2 karakterden olusmalidir.");
			return false;
		}
	}

	@Override
	public boolean userSurnameControl(String surname) {
		if (surname.length() > 2) {
			return true;
		}
		else {
			System.out.println("Soyisminiz en az 2 karakterden olusmalidir.");
			return false;
		}
	}

	@Override
	public boolean userEmailControl(String email) {
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		
		if (!matcher.matches()) {
			System.out.println("Lutfen emailinizi duzgun bicimde giriniz: 'benginur@benginur.com'");
			return false;
		}
		else {
			return true;
		}
	
	}

	@Override
	public boolean userPasswordControl(String password) {
		if (password.length() >= 6) {
			return true;
		}
		else {
			System.out.println("Parola en az 6 karaterden olusmalidir!");
			return false;
		}
		
	}
	

		
	
	
	
}