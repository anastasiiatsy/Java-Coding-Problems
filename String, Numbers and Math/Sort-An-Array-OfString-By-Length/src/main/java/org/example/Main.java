package org.example;


import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] strings = {
        "No", "one", "could", "disentangle", "correctly"};
        System.out.println(Arrays.toString(sortByLengthDsc(strings)));
    }

    /*
    String[] -> String[]
    sorts the strings in the given array by length in ascending order
    "No" "one" "could" "disentangle" "correctly" ->
    "No" "one" "could" "correctly" "disentangle"
    null -> IllegalArgumentException
    ""  -> IllegalArgumentException
     */

    public static String[] sortByLengthAsc(String[] strings) {
        if (strings == null) {
            throw new IllegalArgumentException("Invalid input");
        }
        Arrays.sort(strings, Comparator.comparingInt(String::length));
        return strings;
    }

    // In descending order:
    public static String[] sortByLengthDsc(String[] strings) {
        if (strings == null) {
            throw new IllegalArgumentException("Invalid input");
        }
        Arrays.sort(strings, (a, b) -> b.length() - a.length());
        return strings;
    }

}