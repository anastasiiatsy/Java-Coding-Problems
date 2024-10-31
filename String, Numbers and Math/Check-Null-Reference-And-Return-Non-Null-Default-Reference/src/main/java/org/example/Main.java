package org.example;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        System.out.println(checkNullReference(null));
        System.out.println(checkNullReference("John"));
    }

    //performs null check on the given string and, if it is non-null,
    // returns it. Otherwise, it returns a default value

    public static String checkNullReference(String str) {
        return Objects.requireNonNullElse(str, "No value");
    }
}