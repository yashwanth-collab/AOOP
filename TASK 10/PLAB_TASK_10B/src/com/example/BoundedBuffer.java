package com.example;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BoundedBuffer {
    private int[] buffer = new int[10]; // buffer with maximum capacity of 10 items
    private int count = 0; // number of items in the buffer
    private int in = 0; // index of the next item to be inserted
    private int out = 0; // index of the next item to be removed

    private Lock lock = new ReentrantLock();
    private Condition notFull = lock.newCondition();
    private Condition notEmpty = lock.newCondition();

    public void put(int item) throws InterruptedException {
        lock.lock();
        try {
            while (count == buffer.length) {
                notFull.await(); // wait until buffer is not full
            }
            buffer[in] = item;
            in = (in + 1) % buffer.length;
            count++;
            notEmpty.signal(); // signal that buffer is not empty
        } finally {
            lock.unlock();
        }
    }

    public int take() throws InterruptedException {
        lock.lock();
        try {
            while (count == 0) {
                notEmpty.await(); // wait until buffer is not empty
            }
            int item = buffer[out];
            out = (out + 1) % buffer.length;
            count--;
            notFull.signal(); // signal that buffer is not full
            return item;
        } finally {
            lock.unlock();
        }
    }
}