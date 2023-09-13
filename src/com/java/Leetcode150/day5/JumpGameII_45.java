package com.java.Leetcode150.day5;

public class JumpGameII_45 {
//    Example 1:
//    Input: nums = [2,3,1,1,4]
//    Output: 2
//    Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.

//    Example 2:
//    Input: nums = [2,3,0,1,4]
//    Output: 2

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 1, 4};
        int[] arr2 = {2, 3, 0, 1, 4};
        System.out.println(jump(arr1));
        System.out.println(jump(arr2));
    }

    public static int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }

        int jumps = 0;
        int currentMaxReach = 0;
        int nextMaxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > currentMaxReach) {
                jumps++;
                currentMaxReach = nextMaxReach;
            }
            nextMaxReach = Math.max(nextMaxReach, i + nums[i]);
        }

        return jumps;
    }
}
