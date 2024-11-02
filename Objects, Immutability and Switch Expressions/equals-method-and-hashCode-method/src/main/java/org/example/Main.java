package org.example;

import org.example.myObjects.Player;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Example from the book showcasing a default implementation of the equals() hashCode() methods
        Player p1 = new Player(1, "Rafael Nadal");
        Player p2 = new Player(1, "Rafael Nadal");

        System.out.println(p1.equals(p2)); // returns false as equals() has not been overridden yet
        System.out.println("p1 hash code: " + p1.hashCode()); // returns 2096171631
        System.out.println("p2 hash code: " + p2.hashCode()); // returns 288665596. Both objects point to a different address in the memory

        // Example after the equals() method was overridden
        System.out.println(p1.equals(p2)); // returns true

        // Example before the hashCode() method was overridden

        Set<Player> players = new HashSet<>();// technically a HashSet does not accept duplicates, but as hashCode() method has not been overridden yet, both objects can be added to the HashSet
        players.add(p1);
        players.add(p2);

        System.out.println("p1 hash code: " + p1.hashCode()); // 1809787067
        System.out.println("p2 hash code: " + p2.hashCode()); // 157627094. Here the hash codes are different
        System.out.println("Set size: " + players.size()); // size is 2, as the objects have different hash codes
        System.out.println("Set contains Rafael Nadal: "  + players.contains(new Player(1, "Rafael Nadal"))); // false

        //Example after the hashCode() method was overridden

        System.out.println("p1 hash code: " + p1.hashCode()); // -322171805
        System.out.println("p2 hash code: " + p2.hashCode()); // -322171805 Both objects have the same hash code
        System.out.println("Set size: " + players.size());    // 1
        System.out.println("Set contains Rafael Nadal: "  + players.contains(new Player(1, "Rafael Nadal"))); // true


    }
}