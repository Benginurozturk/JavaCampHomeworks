package Concrete;

import Abstract.UserCheckService;
import Entities.Gamer;

public class UserCheckManager implements UserCheckService{

	//fake control, kendi yazaca��m�z:
	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		return true;
	}

}
