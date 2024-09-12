package com.exaple;
public class PriorityQueue<T extends Comparable<T>> {

    private Object[] heap;
    private int size;

    public PriorityQueue(int capacity) {
        heap = new Object[capacity];
        size = 0;
    }

    // Add an element to the priority queue
    public void add(T element) {
        if (size == heap.length) {
            // If the heap is full, resize it
            resize();
        }
        heap[size] = element;
        heapifyUp(size);
        size++;
    }

    // Remove and return the minimum element from the priority queue
    @SuppressWarnings("unchecked")
    public T remove() {
        if (size == 0) {
            return null;
        }
        T min = (T) heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return min;
    }

    // Heapify up to maintain the heap property
    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;
        if (index > 0 && ((Comparable) heap[parentIndex]).compareTo(heap[index]) > 0) {
            swap(parentIndex, index);
            heapifyUp(parentIndex);
        }
    }

    // Heapify down to maintain the heap property
    private void heapifyDown(int index) {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        int smallest = index;
        if (leftChildIndex < size && ((Comparable) heap[leftChildIndex]).compareTo(heap[smallest]) < 0) {
            smallest = leftChildIndex;
        }
        if (rightChildIndex < size && ((Comparable) heap[rightChildIndex]).compareTo(heap[smallest]) < 0) {
            smallest = rightChildIndex;
        }
        if (smallest != index) {
            swap(smallest, index);
            heapifyDown(smallest);
        }
    }

    // Swap two elements in the heap
    private void swap(int i, int j) {
        Object temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Resize the heap when it's full
    private void resize() {
        Object[] newHeap = new Object[heap.length * 2];
        System.arraycopy(heap, 0, newHeap, 0, heap.length);
        heap = newHeap;
    }

    // Check if the priority queue is empty
    public boolean isEmpty() {
        return size == 0;
    }
}