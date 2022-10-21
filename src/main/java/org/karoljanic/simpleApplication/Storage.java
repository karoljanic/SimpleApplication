package org.karoljanic.simpleApplication;

import java.util.Random;

public class Storage {
    static float getProductPrice(int productID) {
        Random r = new Random();
        return r.nextFloat() * 100;
    }
}
