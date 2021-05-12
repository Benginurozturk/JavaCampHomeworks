package fifthDayFirstHomework.business.abstracts;

import fifthDayFirstHomework.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(String email,String password);
}
