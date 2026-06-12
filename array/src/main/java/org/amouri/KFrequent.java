package org.amouri;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KFrequent {

    public int[] topKFrequent(int[] nums, int k) {

        if (k == nums.length) return nums;

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] res = new int[map.size()];
        int index = 0;

        for (int freq : map.values()) {
            res[index++] = freq;
        }

        Arrays.sort(res);

        int threshold = res[res.length - k];

        int[] result = new int[k];
        index = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= threshold) {
                result[index++] = entry.getKey();

                if (index == k) {
                    break;
                }
            }
        }

        return result;
    }
}
