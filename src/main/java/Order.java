/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nkkr7
 */
public class Order {
        private int orderNumber;
        private int customerID;
        private String date;
        
        public Order(int orderNumber, int customerID, String date) {
                super();
                this.orderNumber = orderNumber;
                this.customerID = customerID;
                this.date = date;
        }

        public int getOrderNumber() {
                return orderNumber;
        }

        public void setOrderNumber(int orderNumber) {
                this.orderNumber = orderNumber;
        }

        public int getCustomerID() {
                return customerID;
        }

        public void setCustomerID(int customerID) {
                this.customerID = customerID;
        }

        public String getDate() {
                return date;
        }

        public void setDate(String date) {
                this.date = date;
        }
        
        public String toString() {
                String string = "";
                
                string += "Order Number: " + this.orderNumber + "\n";
                string += "Customer ID: " + this.customerID + "\n";
                string += "Date: " + this.date + "\n";
                
                return string;
        }
}