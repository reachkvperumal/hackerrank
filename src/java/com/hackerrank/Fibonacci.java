package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Fibonacci {

    /**
     * Iterative implementation for nth Fibonacci number
     * Time Complexity o(n) -- Linear
     * Space Complexity o(1) -- Constant
     *
     * @param n
     * @return
     */

    private static long iterativeFib(int n) {

        if (n < 2) {
            return n;
        }

        long fib = 1;
        long nextFib = 1;
        System.out.printf("ITERATIVE: %d, %d%n", 1, 1);
        for (int i = 2; i <= n; i++) {
            long tmp = fib;
            fib += nextFib;
            nextFib = tmp;

            System.out.printf("ITERATIVE: %d, %d%n", i, fib);

        }
        return fib;
    }

    /**
     * Recursive implementation for nth Fibonacci number
     * Time Complexity o(n) -- Linear
     * Space Complexity o(n) -- Linear
     *
     * @param n
     * @return
     */
    private static long recursiveFib(int n) {
        if (n <= 1)
            return n;
        else
            return recursiveFib(n - 1) + recursiveFib(n - 2);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();


        for (int i = 1; i <= number; i++)
            System.out.printf("RECURSIVE %d %d%n",i,recursiveFib(i));

        iterativeFib(number);


    }
}
