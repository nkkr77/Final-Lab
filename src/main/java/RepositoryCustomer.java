
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nkkr7
 */
public class RepositoryCustomer {
        private final ArrayList <Customer> customers = new ArrayList<>();
        
        public void Create(Customer customer) {
                customers.add(customer);
        }
        
        public ArrayList<Customer> GetAll(){
                return this.customers;
        }
}
