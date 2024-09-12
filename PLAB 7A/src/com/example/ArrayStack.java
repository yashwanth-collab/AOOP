package com.example;

public class ArrayStack<T> implements Stack<T> {
    private T[] elements;
    private int topIndex;
    private int size;

    public ArrayStack(int initialCapacity) {
        elements = (T[]) new Object[initialCapacity];
    }

    @Override
    public void push(T element) {
        if (size == elements.length) {
            // resize the array
            T[] newElements = (T[]) new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[topIndex++] = element;
        size++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T element = elements[--topIndex];
        elements[topIndex] = null; // avoid loitering
        size--;
        return element;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return elements[topIndex - 1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}