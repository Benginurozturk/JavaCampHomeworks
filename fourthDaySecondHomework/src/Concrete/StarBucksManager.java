package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarBucksManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;
	
	public StarBucksManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}
	
	
	
	@Override
	public void save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Bilgileriniz yanlýþ.");
		}
		
		
	}
	
	

}
