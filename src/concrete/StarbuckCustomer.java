package concrete;

import abstracts.CustomerCheckService;
import abstracts.CustomerManager;
import entities.Customer;

public class StarbuckCustomer extends CustomerManager {
private CustomerCheckService customerCheckService;
public StarbuckCustomer(CustomerCheckService customerCheckService) {
    this.customerCheckService=customerCheckService;
}
    @Override
    public void Save(Customer customer) {
    if(customerCheckService.checkIfRealPerson(customer)==true){
        super.Save(customer);
    }
    else {
        System.out.println("Not a valid person");
    }

    }
}
