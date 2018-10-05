package com.hackerrank;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.Stream;

public class Fibonacci8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();

        Stream
                .iterate(
                        new Long[]{1L, 1L}
                        , p -> new Long[]{p[1], p[0] + p[1]}
                )
                .limit(input)
                .forEach(i -> System.out.println(i[0]));


        Stream
                .iterate(
                        new BigInteger[]{BigInteger.ONE, BigInteger.ONE}
                        , bigIntegers -> new BigInteger[]{bigIntegers[1], bigIntegers[0].add(bigIntegers[1])}
                )
                .limit(input)
                .forEach(bigIntegers -> System.out.println(bigIntegers[0].intValue()));
    }
}
