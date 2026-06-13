package org.amouri;

import java.util.HashSet;

public class LargestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {

        if (nums == null || nums.length == 0) return 0;

        HashSet<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }
        int largestConsec = 1;

        for (int num : numsSet) {
            if (numsSet.contains(num - 1)) {
                continue;
            }
            else {
                int currentNum = num;
                int currentConsec = 1;
                while (numsSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentConsec++;
                }
                largestConsec = Math.max(currentConsec, largestConsec);
            }
        }

        return largestConsec;

    }
}
