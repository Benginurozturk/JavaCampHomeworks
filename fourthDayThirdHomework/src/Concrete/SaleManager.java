package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager  implements SaleService{

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(game.getName() + " adl� oyun, " + gamer.getFirstName() + "adl� ki�iye sat�ld�");
		
	}

	@Override
	public void campaignSale(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(
				game.getName() + " adl� oyun, " + 
		        gamer.getFirstName() + " adl� ki�iye, " + 
				campaign.getName() + " kampanyas� kapsam�nda " + 
			    "% " + campaign.getDiscountRate() + " indirim oran� ile " + 
		        discountedPrice(game.getUnitPrice(), campaign.getDiscountRate()) + " fiyata sat�ld�");
		
	}
	
	private double discountedPrice(double unitPrice, double discount) {
		return unitPrice - ((unitPrice * discount) / 100);
	}

}