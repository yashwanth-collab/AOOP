package com.example;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * A thread-safe queue to store messages.
 */
public class SharedBuffer {
    private final BlockingQueue<String> queue;

    public SharedBuffer() {
        this.queue = new LinkedBlockingQueue<>();
    }

    /**
     * Adds a message to the queue.
     *
     * @param message the message to add
     */
    public void put(String message) {
        try {
            queue.put(message);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * Retrieves a message from the queue.
     *
     * @return the retrieved message
     */
    public String take() {
        try {
            return queue.take();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return null;
        }
    }
}