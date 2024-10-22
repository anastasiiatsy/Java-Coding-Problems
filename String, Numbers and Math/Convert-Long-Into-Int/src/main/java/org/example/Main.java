package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println(Math.toIntExact(12345678L));
    }

    /*
    long -> int
    converts the given long value into int.
    12345678L                        -> 12345678
    long > Integer.MAX_VALUE == true -> ArithmeticException
     */
}