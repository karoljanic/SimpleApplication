package org.karoljanic.simpleApplication;

public class Factory {
    private Storage storage;

    Factory(Storage s) {
        storage = s;
    }

    void produceAndStore(int productID, int amount) {
        System.out.println("Production of product with ID = " + productID +
                " in the amount of " + amount + " started!");

        storage.addProducts(productID, amount);
    }
}
