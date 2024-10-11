package org.example;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(removeCharacter('a', "appearance"));
    }

    /*
    char String -> String
    removes the given char from the given string
    'p' "program" -> "rogram"
    'a' "appearance" -> "ppernce"
    'h' null -> IllegalArgumentException
    'i' "" ->   IllegalArgumentException
     */

    public static String removeCharacter(char ch, String str) {
        return str.replaceAll(String.valueOf(ch), "");
    }
    
}