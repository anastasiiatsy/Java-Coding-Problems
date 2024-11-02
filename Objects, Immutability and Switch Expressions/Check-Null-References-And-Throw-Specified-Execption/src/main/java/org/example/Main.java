package org.example;

import java.util.Objects;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Optional<String> nullReference = Optional.ofNullable(null);
        String test = nullReference.orElseThrow(
                () -> new IllegalArgumentException("Invalid argument"));
        Optional<Integer> val = Optional.ofNullable(3);
        Integer testVal = val.orElseThrow(() ->
                new IllegalArgumentException("Invalid argument"));

    }

    // performs the null checks on the given references and throws the specified exception
}