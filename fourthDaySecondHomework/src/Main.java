

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarBucksManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarBucksManager(new MernisServiceAdapter());
		Customer customer = new Customer(1, "Benginur", "Öztürk", 1995, "12345678910");
		customerManager.save(customer);
		

	}

}
