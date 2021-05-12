package fifthDayFirstHomework.core.concretes;

import fifthDayFirstHomework.core.abstracts.RegisterService;
import fifthDayFirstHomework.entities.concretes.User;
import fifthDayFirstHomework.google.GoogleService;

public class GoogleManager implements RegisterService {

	@Override
	public void register(User user) {
		
		GoogleService googleService = new GoogleService();
		googleService.register(user.getName());
		
	}

}
