package org.karoljanic.simpleApplication;

public class OnlineStore implements Store {
    private static final float DELIVERY_PRICE = 9.99f;
    private Storage storage;

    OnlineStore(Storage s) {
        storage = s;
    }

    @Override
    public void sellProduct(int productID) {
        float productPrice = storage.getProductPrice(productID);

        System.out.println("Product price: " + productPrice +
                "\nDelivery Price: " + OnlineStore.DELIVERY_PRICE +
                "\nSum: " + (productPrice + OnlineStore.DELIVERY_PRICE) + "\n");

        storage.removeProducts(productID, 1);
    }
}
