package com.mateacademy;

import java.io.IOException;

public class FlowerApp {
    public static void main(String[] args) {
        FlowerStore store = new FlowerStore();
        store.sell(5, 3, 1);
        FlowerStore.printFlowers(store.getBouquet());
        System.out.println(FlowerStore.getWallet());
        store.sellSequence(5, 3, 1);
        FlowerStore.printFlowers(store.getBouquet());
        System.out.println(FlowerStore.getWallet());

        try {
            FlowersSaver.save(store.getBouquet(), "C:/Users/taureN/Desktop/test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Flower[] flowers = new Flower[9];
        try {
            flowers = FlowersLoader.load("C:/Users/taureN/Desktop/test.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
        FlowerStore.printFlowers(flowers);
    }
}
