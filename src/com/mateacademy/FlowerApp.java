package com.mateacademy;

import java.io.IOException;
import java.util.Arrays;

public class FlowerApp {
    public static void main(String[] args) {
        FlowerStore store = new FlowerStore();
        store.sell(5, 3, 1);
        System.out.println(Arrays.toString(store.getBouquet()));
        System.out.println(FlowerStore.getBalance());
        store.sellSequence(5, 3, 1);
        System.out.println(Arrays.toString(store.getBouquet()));
        System.out.println(FlowerStore.getBalance());


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
        System.out.println("Loaded bouquet: ");
        System.out.println(Arrays.toString(flowers));
    }
}
