package org.amouri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group {

    public List<List<String>> group(String[] strs) {

        if (strs == null || strs.length == 0) return new ArrayList<>();

        int[] count = new int[26];
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                sb.append("#");
                sb.append(count[i]);
                if (!map.containsKey(sb.toString())) {
                    map.put(sb.toString(), new ArrayList<>());
                }

                map.get(sb.toString()).add(s);

            }
        }
        return new ArrayList<>(map.values());

    }

}
