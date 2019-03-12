package com.mateacademy;

public class FlowerStore {

    private static int wallet;
    private Flower[] bouquet;

    public Flower[] sell(int roses, int chamomiles, int tulips) {
        bouquet = new Flower[roses + chamomiles + tulips];
        for (int i = 0; i < roses; i++) {
            bouquet[i] = new Rose();
        }
        for (int i = roses; i < roses + chamomiles; i++) {
            bouquet[i] = new Chamomile();
        }
        for (int i = roses + chamomiles; i < bouquet.length; i++) {
            bouquet[i] = new Tulip();
        }
        wallet += (roses * Rose.PRICE + chamomiles * Chamomile.PRICE + tulips * Tulip.PRICE);
        return bouquet;
    }

    public Flower[] sellSequence(int roses, int chamomiles, int tulips) {
        bouquet = new Flower[roses + chamomiles + tulips];
        wallet += (roses * Rose.PRICE + chamomiles * Chamomile.PRICE + tulips * Tulip.PRICE);
        int maxFlowersInBouquet = Math.max(roses, Math.max(chamomiles, tulips));
        int counter = 0;
        for (int i = 0; i < maxFlowersInBouquet; i++) {
            if (roses > 0) {
                bouquet[counter] = new Rose();
                roses--;
                counter++;
            }
            if (chamomiles > 0) {
                bouquet[counter] = new Chamomile();
                chamomiles--;
                counter++;
            }
            if (tulips > 0) {
                bouquet[counter] = new Tulip();
                tulips--;
                counter++;
            }
        }
        return bouquet;
    }

    public static int getWallet() {
        return wallet;
    }


    public static void printFlowers(Flower[] bouquet) {
        for (Flower flower : bouquet) {
            System.out.print(flower.getClass().getSimpleName() + " ");
        }
        System.out.println();
    }

    public Flower[] getBouquet() {
        return bouquet;
    }
}
