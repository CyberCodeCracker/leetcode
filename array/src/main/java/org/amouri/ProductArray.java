package org.amouri;

import java.util.HashMap;

public class ProductArray {

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int prefix = 1;
        int postfix = 1;

        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix * nums[i];
            prefix *= nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= postfix;
            postfix *= nums[i];
        }

        return result;

    }
}
