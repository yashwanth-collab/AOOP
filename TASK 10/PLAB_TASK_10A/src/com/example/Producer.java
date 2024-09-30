package com.example;

/**
 * Generates messages and puts them into a shared buffer.
 */
public class Producer implements Runnable {
    private final SharedBuffer buffer;
    private final int numMessages;

    public Producer(SharedBuffer buffer, int numMessages) {
        this.buffer = buffer;
        this.numMessages = numMessages;
    }

    @Override
    public void run() {
        for (int i = 0; i < numMessages; i++) {
            String message = "Message " + (i + 1);
            buffer.put(message);
            System.out.println("Produced: " + message);
        }
    }
}