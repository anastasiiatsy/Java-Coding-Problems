package org.example;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        int length = 9;
        System.out.println(Objects.checkIndex(6, length));

    }

    // checks if the given index is between 0 (inclusive) and the given length (exclusive).
    // If the given index is out of the [0, given length] range,
    // then throw IndexOutOfBoundsException.

}