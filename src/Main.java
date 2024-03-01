import abstracts.CustomerManager;
import concrete.NeroCustomer;
import entities.Customer;

import java.time.DateTimeException;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new NeroCustomer();
        LocalDate localDate=LocalDate.now();
        Customer customer=new Customer(1,"Nermin","Memmedli",localDate,764378);
        customerManager.Save(customer);

    }
}