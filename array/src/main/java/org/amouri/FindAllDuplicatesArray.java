package org.amouri;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllDuplicatesArray {
    public List<Integer> findDuplicates(int[] nums) {
        if (nums.length == 1) {
            return new ArrayList<>();
        }

        List<Integer> duplicates = new ArrayList<>();
        HashMap<Integer, Integer> frequencies = new HashMap<>();
        for(int num : nums) {
            int count = frequencies.getOrDefault(num, 1) + 1;
            frequencies.put(num, count);
            if (count == 2) {
                duplicates.add(num);
            }
        }

        return duplicates;
    }
}
