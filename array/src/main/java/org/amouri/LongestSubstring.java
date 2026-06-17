package org.amouri;

import java.util.HashSet;

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;
        if (s.length() == 1) return 1;
        HashSet<Character> charSet = new HashSet<>();
        int maxSubset = 0;
        int left = 0;
        int right = 0;

        while(right < s.length()) {
            char c = s.charAt(right);
            while(charSet.contains(c)) {
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(c);
            maxSubset = Math.max(maxSubset, right - left + 1);
            right++;
        }
        return maxSubset;
    }
}
