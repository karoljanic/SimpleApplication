package org.karoljanic.simpleApplication;

public class OnlineStore implements Store {
    private static final float DELIVERY_PRICE = 9.99f;

    @Override
    public void buyProduct(int productID) {
        float productPrice = Storage.getProductPrice(productID);

        System.out.println("Product price: " + productPrice +
                "\nDelivery Price: " + OnlineStore.DELIVERY_PRICE +
                "\nSum: " + (productPrice + OnlineStore.DELIVERY_PRICE));
    }
}
