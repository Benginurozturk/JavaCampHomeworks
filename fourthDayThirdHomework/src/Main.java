
import java.util.Date;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Gamer gamer = new Gamer(1, "benginur", "öztürk", "benginur@benginur.com", new Date(2021, 11, 07),"123456789");
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer);
		
		Game game = new Game(1, "CLASH OF CLans", 100);
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		
		Campaign campaign = new Campaign(1, "kýþ indirimi", 30);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		SaleManager saleManager = new SaleManager();
		saleManager.campaignSale(game, gamer, campaign);
	}

}