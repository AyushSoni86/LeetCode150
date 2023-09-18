package com.java.leetcode75.day8;

public class IncreasingTripletSubsequence_334 {

//    Example 1:
//    Input: nums = [1,2,3,4,5]
//    Output: true
//    Explanation: Any triplet where i < j < k is valid.

//    Example 2:
//    Input: nums = [5,4,3,2,1]
//    Output: false
//    Explanation: No triplet exists.

//    Example 3:
//    Input: nums = [2,1,5,0,4,6]
//    Output: true
//    Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};
        int[] arr3 = {2, 1, 5, 0, 4, 6};
        System.out.println(increasingTriplet(arr1));
        System.out.println(increasingTriplet(arr2));
        System.out.println(increasingTriplet(arr3));
    }

    public static boolean increasingTriplet(int[] nums) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= a) a = num;
            else if (num < b) b = num;
            else if (num > b) return true;
        }
        return false;
    }
}
