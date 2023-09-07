package com.java.day1;

import java.util.Arrays;

public class MergeArray {
    //    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    //    Output: [1,2,2,3,5,6]
    //    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
    //    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 7, 8, 9};
        int m = 6;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m + n];
        int i = 0, j = 0, index = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                arr[index] = nums1[i];
                i++;
            } else {
                arr[index] = nums2[j];
                j++;
            }
            index++;

        }
        while (i < m) {
            arr[index++] = nums1[i++];
        }
        while (j < n) {
            arr[index++] = nums2[j++];
        }
        nums1 = arr;
        for (int k = 0; k < arr.length; k++) {
            nums1[i] = arr[i];
        }
        System.out.println(Arrays.toString(nums1));
    }
}
