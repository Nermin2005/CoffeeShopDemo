package abstracts;

import entities.Customer;

public abstract class CustomerManager implements CustomerService{
    @Override
    public void Save(Customer customer) {
        System.out.println("Save to db "+customer.getFirstName());
    }
}
