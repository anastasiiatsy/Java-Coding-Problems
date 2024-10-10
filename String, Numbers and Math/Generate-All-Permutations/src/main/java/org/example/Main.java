package org.example;

public class Main {

    public static void main(String[] args) {
        String test = "ABC";
        permuteAndPrint("", test);
    }

    /*
    String String -> void
    generates and prints all the permutations of a given string
    (meaning rearrangement of the characters in a given string)
    ABC -> ABC ACB BCA BAC CAB CBA
    null null  -> IllegalArgumentException
    "" null -> IllegalArgumentException
     */

    private static void permuteAndPrint(String prefix,
                                        String str) {

        if (prefix == null || str == null || str.isBlank()) {
            throw new IllegalArgumentException("Invalid input");
        }
        
        int length = str.length();

        if (length == 0) {
            System.out.println(prefix + " ");
        } else {
            for (int i = 0; i < length; i++) {
                String newPrefix = prefix + str.charAt(i);
                String newString = str.substring(i + 1, length) + str.substring(0, i);

                permuteAndPrint(newPrefix,
                        newString);
            }
        }
    }

}