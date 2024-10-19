package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println(max(2,3));
    }

    /*
    int int -> int
    returns the minimum number of the two
    2 3 -> 2
    4 8 -> 4
     */

    public static int min(int a, int b) {
        return Math.min(a, b);
    }

        /*
    int int -> int
    returns the maximum number of the two
    2 3 -> 3
    4 8 -> 8
     */

    public static int max(int a, int b) {
        return Math.max(a, b);
    }
}