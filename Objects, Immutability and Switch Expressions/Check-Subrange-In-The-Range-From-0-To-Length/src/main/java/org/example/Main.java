package org.example;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        int startIndex = 20;
        int endIndex = 27;
        int length = 10;
        System.out.println(Objects.checkFromToIndex(startIndex, endIndex, length));
    }

    /*
    Checks whether the given subrange [given start, given end] is within the bounds
    of the range from [0, given length].
    If the given subrange is not in the [0, given length] range,
    then throw IndexOutOfBoundsException
    */
}