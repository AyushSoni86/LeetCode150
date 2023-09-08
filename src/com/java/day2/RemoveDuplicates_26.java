package com.java.day2;

import java.util.Arrays;

public class RemoveDuplicates_26 {
//    Example 1:
//    Input: nums = [1,1,2]
//    Output: 2, nums = [1,2,_]
//    Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
//    It does not matter what you leave beyond the returned k (hence they are underscores).

    //    Example 2:
//    Input: nums = [0,0,1,1,1,2,2,3,3,4]
//    Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
//    Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
//    It does not matter what you leave beyond the returned k (hence they are underscores).
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums1 = {1, 1, 2};
        System.out.println(removeDuplicates(nums1));
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                arr[j + 1] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return j + 1;

    }
}
