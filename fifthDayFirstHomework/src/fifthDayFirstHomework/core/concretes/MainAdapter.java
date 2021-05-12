package fifthDayFirstHomework.core.concretes;

import fifthDayFirstHomework.entities.concretes.User;
import fifthDayFirstHomework.core.abstracts.RegisterService;


public class MainAdapter implements RegisterService {

	@Override
	public void register(User user) {
		
		System.out.println(" giris saglandi iyi eglenceler :* "+ user.getName());
		
	}

}