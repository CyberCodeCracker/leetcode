package org.amouri;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> charTable = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            charTable.put(s.charAt(i), charTable.getOrDefault(s.charAt(i), 0) + 1);
            charTable.put(t.charAt(i), charTable.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (int count : charTable.values()) {
            if (count != 0) return false;
        }

        return true;
    }
}
