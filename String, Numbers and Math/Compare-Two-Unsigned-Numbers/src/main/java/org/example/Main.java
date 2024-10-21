package org.example;
public class Main {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;
        System.out.println(Integer.compareUnsigned(200, 500));
    }

    /*
    int int -> int
    compares given two numbers as unsigned
    x y -> x == y = 0
    x y -> x < y = -1
    x y -> y > x = 1
     */
}