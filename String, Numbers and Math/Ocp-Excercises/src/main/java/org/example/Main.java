package org.example;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        int n = 4;
        while (n != 1) {

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.println(n);
        }
    }
}