package org.karoljanic.simpleApplication;

public class Management {

    public static void main(final String[] args) {
        final Storage storage = new Storage();

        final Factory factory1 = new Factory(storage);
        final Factory factory2 = new Factory(storage);

        final OnlineStore onlineStore = new OnlineStore(storage);
        final StationaryStore stationaryStore = new StationaryStore(storage);

        storage.addProductType(1, 7.99f);
        storage.addProductType(2, 29.99f);
        storage.addProductType(3, 53.99f);

        storage.displayStorageInfo();

        factory1.produceAndStore(1, 10);
        factory2.produceAndStore(2, 5);
        factory2.produceAndStore(3, 12);

        storage.displayStorageInfo();

        stationaryStore.sellProduct(1);
        onlineStore.sellProduct(2);
        stationaryStore.sellProduct(3);

        storage.displayStorageInfo();
    }
}
