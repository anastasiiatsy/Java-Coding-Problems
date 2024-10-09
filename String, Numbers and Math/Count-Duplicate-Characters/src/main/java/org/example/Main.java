package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String string = "Count duplicate characters";
        String nullValue = null;
        countDuplicateCharacters(nullValue);
    }

    public static Map<Character,Integer> countDuplicateCharacters(String string) {
        if (string == null) {
            System.out.println("wrong value");
            return null;
        }

        Map<Character, Integer> characters = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);

            characters.compute(ch, (k,v) -> (v == null)? 1 : v + 1);

/*           Another solution:
          if (!characters.containsKey(ch)) {
               characters.put(ch, 1);
           } else {
               characters.put(ch, characters.get(ch) + 1);
          }
 */
        }
       return characters;
    }

// Another solution using streams
    public static Map<Character, Long> countDuplicateCharactersStream(String string) {
        Map<Character, Long> characters =
                string.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

        return characters;
    }

}