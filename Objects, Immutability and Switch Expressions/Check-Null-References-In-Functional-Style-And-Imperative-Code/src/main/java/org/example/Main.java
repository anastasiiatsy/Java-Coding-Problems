package org.example;

import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        System.out.println(isNull(null));
        System.out.println(isNull("Test"));
    }

    // returns true if the object is a null reference
   public static boolean isNull(Object object) {
        return Objects.isNull(object);
   }

   public static int sum(List<Integer> list) {

        if (Objects.isNull(list)) {
            throw new IllegalArgumentException("Invalid input");
        }

        return list.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .sum();
   }
}