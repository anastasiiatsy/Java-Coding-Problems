package org.example;

public class Main {

    public static void main(String[] args) {
         float f = 20.05f;
        System.out.println(Math.nextUp(f));
        System.out.println(Math.nextDown(f));
    }
    /*
    float -> float
    produces the next floating-point adjacent to the given float/double value in the direction of positive and negative infinity
     */
}