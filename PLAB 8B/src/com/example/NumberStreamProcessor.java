package com.example;

public class NumberStreamProcessor {
    public static void processNumbers(int[] numbers) {
        // Filter even numbers
        int[] evenNumbers = filterEvenNumbers(numbers);

        // Double even numbers
        int[] doubledNumbers = doubleNumbers(evenNumbers);

        // Collect into a list
        int[] result = collectNumbers(doubledNumbers);

        // Print the result
        printResult(result);
    }

    private static int[] filterEvenNumbers(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (EvenNumberProcessor.isEven(number)) {
                count++;
            }
        }

        int[] evenNumbers = new int[count];
        int index = 0;
        for (int number : numbers) {
            if (EvenNumberProcessor.isEven(number)) {
                evenNumbers[index++] = number;
            }
        }

        return evenNumbers;
    }

    private static int[] doubleNumbers(int[] numbers) {
        int[] doubledNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            doubledNumbers[i] = EvenNumberProcessor.doubleNumber(numbers[i]);
        }

        return doubledNumbers;
    }

    private static int[] collectNumbers(int[] numbers) {
        return numbers;
    }

    private static void printResult(int[] numbers) {
        System.out.println("Result: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}