package Abstract;

import Entities.Customer;

public class BaseCustomerManager implements CustomerService{

	public void save(Customer customer) {
		System.out.println("Kayd�n�z olmu�tur : "+ customer.getFirstName());
		
	}

}
