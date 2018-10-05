package com.hackerrank;

import java.util.Scanner;
import java.util.function.LongPredicate;
import java.util.stream.LongStream;

public class PrimeNumber {

    private static boolean isPrime(long number) {
        return number > 1 && LongStream
                .rangeClosed(2, (long) Math.sqrt(number))
                .noneMatch(index -> number % index == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        scanner.close();

        LongStream
                .rangeClosed(1, number)
                .parallel()
                .filter(PrimeNumber::isPrime)
                .forEach(value -> System.out.printf("%d is prime%n", value));
    }

}
