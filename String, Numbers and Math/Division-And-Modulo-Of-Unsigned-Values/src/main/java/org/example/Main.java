package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println(Integer.divideUnsigned(400, 25));
        System.out.println(Integer.remainderUnsigned(400, 3));
    }

    /*
    int int  -> int
    computes the division of the given unsigned value
    4 2    -> 2
    400 25 -> 16
     */

    /*
    int int -> int
    compute the modulo of the given unsigned value
    400 2 -> 0
    400 3 -> 1
     */
}