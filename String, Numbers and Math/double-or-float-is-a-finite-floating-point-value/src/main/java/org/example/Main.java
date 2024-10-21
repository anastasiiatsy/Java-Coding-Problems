package org.example;

public class Main {

    public static void main(String[] args) {
        Float num1 = 7.5f / 0;
        Double num2 = 8.3456789 / 0;
        System.out.println(Float.isFinite(123456789.45678f ));
        System.out.println(Double.isFinite(num2));
    }

    /*
    Float or Double -> Boolean
    determines whether the given double/float value is a finite floating-point value
    123456789.45678f  -> true
    (8.3456789 / 0)   -> false
     */
}