package com.mateacademy;

public class FlowerStore {

    private static int balance;
    private Flower[] bouquet;

    public Flower[] sell(int roses, int chamomiles, int tulips) {
        bouquet = new Flower[roses + chamomiles + tulips];
        for (int i = 0; i < roses; i++) {
            bouquet[i] = new Rose(100);
        }
        for (int i = roses; i < roses + chamomiles; i++) {
            bouquet[i] = new Chamomile(70);
        }
        for (int i = roses + chamomiles; i < bouquet.length; i++) {
            bouquet[i] = new Tulip(45);
        }
        calculatePrice(bouquet);
        return bouquet;
    }

    public Flower[] sellSequence(int roses, int chamomiles, int tulips) {
        bouquet = new Flower[roses + chamomiles + tulips];
        int maxFlowersInBouquet = Math.max(roses, Math.max(chamomiles, tulips));
        int counter = 0;
        for (int i = 0; i < maxFlowersInBouquet; i++) {
            if (roses > 0) {
                bouquet[counter] = new Rose(100);
                roses--;
                counter++;
            }
            if (chamomiles > 0) {
                bouquet[counter] = new Chamomile(70);
                chamomiles--;
                counter++;
            }
            if (tulips > 0) {
                bouquet[counter] = new Tulip(45);
                tulips--;
                counter++;
            }
        }
        calculatePrice(bouquet);
        return bouquet;
    }

    public static int getBalance() {
        return balance;
    }

    private static void calculatePrice(Flower[] flowers) {
        for (Flower flower : flowers) {
            balance += flower.getPrice();
        }
    }


    public Flower[] getBouquet() {
        return bouquet;
    }
}
