/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nkkr7
 */

public class OrderItem {
        private int orderNumber;
        private int lineNumber;
        private int productID;
        private String productDescription;
        private int quantity;
        private double price;
        
        public OrderItem(int orderNumber, int lineNumber, int productID, String productDescription, int quantity,
                        double price) {
                super();
                this.orderNumber = orderNumber;
                this.lineNumber = lineNumber;
                this.productID = productID;
                this.productDescription = productDescription;
                this.quantity = quantity;
                this.price = price;
        }

        public int getOrderNumber() {
                return orderNumber;
        }

        public void setOrderNumber(int orderNumber) {
                this.orderNumber = orderNumber;
        }

        public int getLineNumber() {
                return lineNumber;
        }

        public void setLineNumber(int lineNumber) {
                this.lineNumber = lineNumber;
        }

        public int getProductID() {
                return productID;
        }

        public void setProductID(int productID) {
                this.productID = productID;
        }

        public String getProductDescription() {
                return productDescription;
        }

        public void setProductDescription(String productDescription) {
                this.productDescription = productDescription;
        }

        public int getQuantity() {
                return quantity;
        }

        public void setQuantity(int quantity) {
                this.quantity = quantity;
        }

        public double getPrice() {
                return price;
        }

        public void setPrice(double price) {
                this.price = price;
        }
        
        public String toString() {
                String string = "";
                
                string += "Order Number: " + this.orderNumber + "\n";
                string += "Line Number: " + this.lineNumber + "\n";
                string += "Product ID: " + this.productID + "\n";
                string += "Product Description: " + this.productDescription + "\n";
                string += "Quantity: " + this.quantity + "\n";
                string += "Price: " + this.price + "\n";
                
                return string;
        }
}
