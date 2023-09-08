package com.java.day2;

import java.util.Arrays;

public class RemoveDuplicates_80 {
    //    Example 1:
//    Input: nums = [1,1,1,2,2,3]
//    Output: 5, nums = [1,1,2,2,3,_]
//    Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
//    It does not matter what you leave beyond the returned k (hence they are underscores).
//
//    Example 2:
//    Input: nums = [0,0,1,1,1,1,2,3,3]
//    Output: 7, nums = [0,0,1,1,2,3,3,_,_]
//    Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
//    It does not matter what you leave beyond the returned k (hence they are underscores).
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int[] arr1 = {1, 1, 1, 2, 2, 3};
        int[] arr2 = {0, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 4, 4, 4, 4, 5};
        System.out.println(removeDuplicates(arr));
        System.out.println(removeDuplicates(arr1));
        System.out.println(removeDuplicates(arr2));
    }

    public static int removeDuplicates(int[] arr) {
        int j = 2;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] != arr[j-2])
                arr[j++] = arr[i];
        }
        return j;
    }


}
