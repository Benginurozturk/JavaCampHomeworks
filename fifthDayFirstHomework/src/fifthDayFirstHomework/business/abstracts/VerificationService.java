package fifthDayFirstHomework.business.abstracts;

public interface VerificationService {
	boolean userNameControl(String username);
	boolean userSurnameControl(String username);
	boolean userEmailControl(String username);
	boolean userPasswordControl(String username);
}
