package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println(joinByDelimiter(List.of(), "*"));
    }
    /*
    List.of(String) String -> String
    joins the given strings from the list by the given delimiter
    List.of("apples", "bananas", "lemons", "strawberries") "-" ->
    apples-bananas-lemons-strawberries
    List.of("chair" "table" "bookshelf") "*" ->
    char*table*bookshelf
    null null -> InvalidArgumentException
    null "=" -> InvalidArgumentException
    List.of(...) "" -> InvalidArgumentException
    list.size() == 0, "*" -> "No elements in the list."
     */

    public static String joinByDelimiter(List<String> list, String delimiter) {
        if (list == null || delimiter == null || delimiter.isBlank()) {
            throw new IllegalArgumentException("Invalid input");
        }

        if (list.isEmpty()) {
            System.out.println("No elements in the list.");
        }

        String result = list.stream()
                .collect(Collectors.joining(delimiter));
        return result;
    }
}