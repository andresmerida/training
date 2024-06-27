package org.andres.training.hackerrank.gameoftrones;

import java.util.HashMap;
import java.util.Map;

/**
 * Game of Thrones - I
 * Dothraki are planning an attack to usurp King Robert's throne.
 * King Robert learns of this conspiracy from Raven and plans to lock the single door through which the enemy can enter his kingdom.
 * But, to lock the door he needs a key that is an anagram of a palindrome.
 * He starts to go through his box of strings,
 * checking to see if they can be rearranged into a palindrome. Given a string, determine if it can be rearranged into a palindrome.
 * Return the string YES or NO.
 * Example
 * s = 'aabbccdd'
 * One way this can be arranged into a palindrome is . Return YES.
 * Complete the gameOfThrones function below
 * return String YES or NO
 */
public class GameOfThronesI {
    public static void main(String[] args) {
        String inputString = "alam";
        System.out.println(gameOfThrones(inputString));
    }

    static String gameOfThrones(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        int counter = 0;
        for (Character c : map.keySet()) {
            if (map.get(c) % 2 != 0) {
                counter++;
            }
            if (map.get(c) % 2 != 0 && counter > 1) {
                return "NO";
            }
        }
        return "YES";
    }
}
