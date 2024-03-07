package org.example;

import java.util.EmptyStackException;

public class MyStackTester {

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<Integer>();

        // Test pushing elements
        System.out.println("Pushing elements onto stack...");
        stack.push(10);
        stack.push(20);
        System.out.println("Expected stack size 2, actual size: " + stack.size());

        // Test popping elements
        System.out.println("Popping elements from stack...");
        System.out.println("Popped: " + stack.pop());
        System.out.println("Expected stack size 1, actual size: " + stack.size());
        System.out.println("Popped: " + stack.pop());

        // Test popping from an empty stack
        try {
            System.out.println("Attempting to pop from an empty stack...");
            stack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Caught EmptyStackException as expected.");
        }
    }
}
