package org.karoljanic.simpleApplication;

public class StationaryStore implements Store {
    private Storage storage;

    StationaryStore(Storage s) {
        storage = s;
    }

    @Override
    public void sellProduct(int productID) {
        float productPrice = storage.getProductPrice(productID);

        System.out.println("Product price: " + productPrice +
                "\nDelivery Price: 0" +
                "\nSum: " + productPrice + "\n");

        storage.removeProducts(productID, 1);
    }
}
