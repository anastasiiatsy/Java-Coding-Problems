package org.example;

public class Main {
    public static void main(String[] args) {
        boolean one = true;
        boolean two = false;
        System.out.println(Boolean.logicalAnd(one, two));
        System.out.println(Boolean.logicalOr(one, two));
        System.out.println(Boolean.logicalXor(one, two));
        System.out.println(Boolean.logicalXor(one, one));
    }

    /*
    boolean boolean -> boolean
    applies the logical AND/OR/XOR (&&, ||, ^) to two boolean expressions
     */
}