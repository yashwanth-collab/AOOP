package com.example;

public class Main {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();
        int numMessages = 10;

        Producer producer = new Producer(buffer, numMessages);
        Consumer consumer = new Consumer(buffer, numMessages);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}