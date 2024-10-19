package org.example;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        String[] texts = {"abc", "abcd", "abcde", "ab", "abcd", "abcdef"};
        System.out.println(longestCommonPrefix(texts));
    }
    /*
    String String -> String
    returns the longest common prefix of the given strings
    "produce" "prospect"  -> "pro"
    "midway" "midsummer"  -> "mid"
    "unpopular" "unusual" -> "un"
    null null             -> IllegalArgumentException
     */

    public static String findCommonPrefix(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException("Invalid input");
        }

        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        int mismatch = Arrays.mismatch(array1, array2);

        return str1.substring(0,mismatch);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {    return strs[0];  }
        int firstLen = strs[0].length();
        for (int prefixLen = 0; prefixLen < firstLen; prefixLen++) {
            char ch = strs[0].charAt(prefixLen);
            for (int i = 1; i < strs.length; i++) {
                if (prefixLen >= strs[i].length() || strs[i].charAt(prefixLen) != ch) {
                    return strs[i].substring(0, prefixLen);      }    }  }
        return strs[0];}
    }