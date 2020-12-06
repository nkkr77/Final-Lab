
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

public class RepositoryOrder {
        private final ArrayList <Order> orders = new ArrayList<>();
        
        public void Create(Order order) {
                orders.add(order);
        }
        
        public ArrayList<Order> GetAll(){
                return this.orders;
        }
}
