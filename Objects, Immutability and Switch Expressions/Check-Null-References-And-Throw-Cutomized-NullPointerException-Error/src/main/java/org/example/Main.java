package org.example;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        String testObject = Objects.requireNonNull(null, "Invalid Input");
        String anotherTestObject = Objects.requireNonNull("Test", "Invalid object");
        System.out.println(anotherTestObject);
    }
    // performs null checks on the given reference and throws NullPointerException with custom messages


}