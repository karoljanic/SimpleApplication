package org.karoljanic.simpleApplication;

import java.util.HashMap;

public class Storage {
    private HashMap<Integer, Integer> productsAmount;
    private HashMap<Integer, Float> productsPrice;

    Storage() {
        productsAmount = new HashMap<>();
        productsPrice = new HashMap<>();
    }

    void addProductType(int productID, float price) {
        productsAmount.put(productID, 0);
        productsPrice.put(productID, price);
    }

    void addProducts(int productID, int amount) {
        productsAmount.put(productID, getProductAmount(productID) + amount);
    }

    void removeProducts(int productID, int amount) {
        addProducts(productID, -amount);
    }

    int getProductAmount(int productID) {
        return productsAmount.get(productID);
    }

    float getProductPrice(int productID) {
        return productsPrice.get(productID);
    }

    void displayStorageInfo() {
        System.out.println("\nStorage Info: ");
        for (int key: productsAmount.keySet()) {
            System.out.println("Amount of " + key + ": " + productsAmount.get(key));
        }
        System.out.println();
    }
}
