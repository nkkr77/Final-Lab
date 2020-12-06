/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nkkr7
 */

import java.util.ArrayList;

public class OrderSystem {

        public static void main(String[] args) {
                RepositoryCustomer repositoryCustomer = new RepositoryCustomer();
                RepositoryOrder repositoryOrder = new RepositoryOrder();
                RepositoryOrderItem repositoryOrderItem = new RepositoryOrderItem();
                RepositoryProduct repositoryProduct = new RepositoryProduct();
                
                Customer customer1 = new Customer(0001, "Lillian", "Dreher", "919-125-9785");
                Customer customer2 = new Customer(0002, "Judith", "Dreher", "952-789-8284");
                Customer customer3 = new Customer(0003, "Kale", "Dreher", "549-749-3802");
                
                repositoryCustomer.Create(customer1);
                repositoryCustomer.Create(customer2);
                repositoryCustomer.Create(customer3);
                
                Product product1 = new Product(1110, "Books", 1, 200);
                Product product2 = new Product(1111, "Paint Ball", 2, 300);
                Product product3 = new Product(1112, "Movies", 3, 100);
                Product product4 = new Product(1113, "Fishing", 4, 1000);
                Product product5 = new Product(1114, "Sports", 5, 1200);
                Product product6 = new Product(1115, "GoKarting", 6, 1400);
                
                repositoryProduct.Create(product1);
                repositoryProduct.Create(product2);
                repositoryProduct.Create(product3);
                repositoryProduct.Create(product4);
                repositoryProduct.Create(product5);
                repositoryProduct.Create(product6);
                
                Order order1 = new Order(9997, 0001, "12/04/2020");
                Order order2 = new Order(9998, 0002, "12/05/2020");
                Order order3 = new Order(9999, 0003, "12/06/2020");
              
                repositoryOrder.Create(order1);
                repositoryOrder.Create(order2);
                repositoryOrder.Create(order3);
                
                OrderItem orderItem1 = new OrderItem(9997, 9000, 1110, "Books", 1, 200);
                OrderItem orderItem2 = new OrderItem(9998, 9001, 1111, "Paint Ball", 2, 300);
                OrderItem orderItem3 = new OrderItem(9997, 9002, 1112, "Movies", 3, 100);
                OrderItem orderItem4 = new OrderItem(9998, 9003, 1113, "Fishing", 4, 1000);
                OrderItem orderItem5 = new OrderItem(9999, 9004, 1114, "Sports", 5, 1200);
                OrderItem orderItem6 = new OrderItem(9999, 9005, 1115, "GoKarting", 6, 1400);
                
                repositoryOrderItem.Create(orderItem1);
                repositoryOrderItem.Create(orderItem2);
                repositoryOrderItem.Create(orderItem3);
                repositoryOrderItem.Create(orderItem4);
                repositoryOrderItem.Create(orderItem5);
                repositoryOrderItem.Create(orderItem6);
                
                ArrayList <Customer> customers = repositoryCustomer.GetAll();
                ArrayList <Order> order = repositoryOrder.GetAll();
                ArrayList <OrderItem> orderItem = repositoryOrderItem.GetAll();
                ArrayList <Product> products = repositoryProduct.GetAll();
                
                for (int i = 0; i < customers.size(); i++) {
                        for (int y = 0; y < orderItem.size(); y++) {
                                if (customers.get(i).getCustomerID() == order.get(i).getCustomerID()) {
                                        if (order.get(i).getOrderNumber() == orderItem.get(y).getOrderNumber()) {
                                                System.out.println(customers.get(i).toString());
                                                System.out.println(order.get(i).toString());
                                                System.out.println(orderItem.get(i).toString());
                                        }
                                }
                        }
                }
        }

}
