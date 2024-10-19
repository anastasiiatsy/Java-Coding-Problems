package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum(9, 6));
    }

    /*
    long long -> long
    sums two given numbers
    4 6                       -> 10
    if sum > Long. MAX_VALUE  -> ArithmeticException
     */

    public static long sum(long a, long b) {
      return Math.addExact(a, b);
    }
}