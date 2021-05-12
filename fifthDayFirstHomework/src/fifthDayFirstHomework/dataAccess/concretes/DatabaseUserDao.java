package fifthDayFirstHomework.dataAccess.concretes;

import fifthDayFirstHomework.dataAccess.abstracts.UserDao;
import fifthDayFirstHomework.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class DatabaseUserDao implements UserDao {

	private List<User> users;
	
	public DatabaseUserDao() {
		super();
		this.users = new ArrayList<User>();
	}

	
	
	@Override
	public void add(User user) {
		
		users.add(user);
		System.out.println("Kullanici sisteme eklendi :) " + user.getName());
		
	}

	@Override
	public void delete(User user) {
		
		users.remove(user);
		System.out.println("Kullanici sistemden silindi :( " + user.getName());
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.users;
	}

	
	

}