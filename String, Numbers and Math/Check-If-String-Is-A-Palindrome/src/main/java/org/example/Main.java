package org.example;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindromeV3("madame"));
    }

    /*
    String -> Boolean
    returns true if the given string is a palindrome
    "noon" -> true
    "civic" -> true
    "test" -> false
    null -> IllegalArgumentException
    "" -> IllegalArgumentException
     */

    public static boolean isPalindrome(String str) {

        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Invalid input");
        }

        StringBuilder reversedString = new StringBuilder(str).reverse();

        return str.equals(reversedString.toString());
    }

    public static boolean isPalindromeV2(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Invalid input");
        }

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            char chl = str.charAt(left);
            char chr = str.charAt(right);

            if (chl != chr) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    public static boolean isPalindromeV3(String str) {
        return IntStream.range(0, str.length() / 2)
                .allMatch(p -> str.charAt(p)
                        ==
                        str.charAt(str.length() - p - 1));
    }
}