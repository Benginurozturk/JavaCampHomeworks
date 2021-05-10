package Concrete;
import Abstract.GamerService;
import Abstract.UserCheckService;
import Entities.Gamer;

public class GamerManager implements GamerService{

	UserCheckService checkService;
	public GamerManager(UserCheckService checkService) {
		this.checkService = checkService;
	}
	@Override
	public void add(Gamer gamer) {
		personControl(gamer);
		System.out.println(gamer.getFirstName() + " adl� kullan�c� eklendi");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " adl� kullan�c� silindi");
		
	}

	@Override
	public void update(Gamer gamer) {
		personControl(gamer);
		System.out.println(gamer.getFirstName() + " adl� kullan�c� g�ncellendi");
	}
	
	//i� kodu:
	private void personControl(Gamer gamer) {
		if(checkService.checkIfRealPerson(gamer)) {
			System.out.println("kullan�c� bulundu");
		}
		else {
			System.out.println("kullan�c� bulunamad�");
		}
	}
	
}