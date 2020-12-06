/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nkkr7
 */
public class Product {
        private int productID;
        private String description;
        private int quantityOnHand;
        private double price;
        
        public Product(int productID, String description, int quantityOnHand, double price) {
                super();
                this.productID = productID;
                this.description = description;
                this.quantityOnHand = quantityOnHand;
                this.price = price;
        }

        public int getProductID() {
                return productID;
        }

        public void setProductID(int productID) {
                this.productID = productID;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public int getQuantityOnHand() {
                return quantityOnHand;
        }

        public void setQuantityOnHand(int quantityOnHand) {
                this.quantityOnHand = quantityOnHand;
        }

        public double getPrice() {
                return price;
        }

        public void setPrice(double price) {
                this.price = price;
        }
        
        public String toString() {
                String string = "";
                
                string += "Product ID: " + this.productID + "\n";
                string += "Description: " + this.description + "\n";
                string += "Quantity At Hand: " + this.quantityOnHand + "\n";
                string += "Price" + this.price + "\n";
                
                return string;
        }
}
