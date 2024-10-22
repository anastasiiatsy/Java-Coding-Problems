package org.example;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        BigInteger value = BigInteger.valueOf(Short.MAX_VALUE);
        int convertedValue = value.intValueExact();
        System.out.println(value + " " + convertedValue);
    }

    /*
    BigInteger -> int
    converts the given BigInteger into an int
    Long.MAX_VALUE -> ArithmeticException
     */
}