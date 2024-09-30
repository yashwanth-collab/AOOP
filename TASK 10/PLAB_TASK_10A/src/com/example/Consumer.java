package com.example;

/**
 * Consumes messages from the shared buffer.
 */
public class Consumer implements Runnable {
    private final SharedBuffer buffer;
    private final int numMessages;

    public Consumer(SharedBuffer buffer, int numMessages) {
        this.buffer = buffer;
        this.numMessages = numMessages;
    }

    @Override
    public void run() {
        for (int i = 0; i < numMessages; i++) {
            String message = buffer.take();
            System.out.println("Consumed: " + message);
        }
    }
}