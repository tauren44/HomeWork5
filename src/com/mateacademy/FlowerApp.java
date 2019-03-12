package com.mateacademy;

public class FlowerApp {
    public static void main(String[] args) {
        FlowerStore store = new FlowerStore();
        store.sell(5, 3, 1);
        store.printFlowers();
        System.out.println(FlowerStore.getWallet());
        store.sellSequence(5, 3, 1);
        store.printFlowers();
        System.out.println(FlowerStore.getWallet());
    }
}
