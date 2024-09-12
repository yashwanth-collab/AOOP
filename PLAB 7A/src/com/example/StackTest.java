package com.example;
public class StackTest {
    public static void main(String[] args) {
        // Test with integers
        Stack<Integer> intStack = new LinkedListStack<>();
        intStack.push(1);
        intStack.push(2);
        System.out.println(intStack.peek()); // 2
        System.out.println(intStack.pop()); // 2
        System.out.println(intStack.isEmpty()); // false

        // Test with strings
        Stack<String> stringStack = new ArrayStack<>(10);
        stringStack.push("hello");
        stringStack.push("world");
        System.out.println(stringStack.peek()); // world
        System.out.println(stringStack.pop()); // world
        System.out.println(stringStack.isEmpty()); // false
    }
}