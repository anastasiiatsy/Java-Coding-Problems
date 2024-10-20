package org.example;

public class Main {

    public static void main(String[] args) {
        int i = Integer.parseUnsignedInt("834", 16);
        System.out.println(i);
    }

    /*
    String -> int
    parses the given string into unsigned number in the given radix
    "255500" 16 -> 2446592
    "834" 16    -> 2100
     */
}