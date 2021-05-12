package fifthDayFirstHomework.dataAccess.abstracts;

import java.util.List;

import fifthDayFirstHomework.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	List<User> getAll();

}
