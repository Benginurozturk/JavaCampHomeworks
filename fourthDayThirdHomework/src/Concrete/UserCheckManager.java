package Concrete;

import Abstract.UserCheckService;
import Entities.Gamer;

public class UserCheckManager implements UserCheckService{

	//fake control, kendi yazacağımız:
	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		return true;
	}

}
