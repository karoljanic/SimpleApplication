package org.karoljanic.simpleApplication;

public class StationaryStore implements Store {
    @Override
    public void buyProduct(int productID) {
        float productPrice = Storage.getProductPrice(productID);

        System.out.println("Product price: " + productPrice +
                "\nDelivery Price: 0" +
                "\nSum: " + productPrice);
    }
}
