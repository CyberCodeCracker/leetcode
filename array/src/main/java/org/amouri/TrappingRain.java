package org.amouri;

public class TrappingRain {
    public int trap(int[] height) {
        if (height.length == 0) return 0;

        int left = 0;
        int right = 1;
        int leftMax = height[left];
        int rightMax = height[right];
        int waterSize = 0;

        while (left < right) {
            if (height[left] > height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                if (leftMax - height[left] > 0) {
                    waterSize += leftMax - height[left];
                }
                left++;
            }
            else {
                rightMax = Math.max(rightMax, height[right]);
                if (rightMax - height[right] > 0) {
                    waterSize += rightMax - height[right];
                }
                right++;
            }
        }
        return waterSize;
    }
}
