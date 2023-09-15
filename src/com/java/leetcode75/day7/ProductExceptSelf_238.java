package com.java.leetcode75.day7;

import java.util.Arrays;

public class ProductExceptSelf_238 {
    //    Example 1:
//
//    Input: nums = [1,2,3,4]
//    Output: [24,12,8,6]
//    Example 2:
//
//    Input: nums = [-1,1,0,-3,3]
//    Output: [0,0,9,0,0]
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {-1, 1, 0, -3, 3};
        System.out.println(Arrays.toString(productExceptSelf(arr1)));
        System.out.println(Arrays.toString(productExceptSelf(arr2)));
    }

    public static int[] productExceptSelf(int[] arr) {
        int[] ans = new int[arr.length];
        boolean isZero = false;
        int product = 1;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                isZero = true;
                count++;
                continue;
            }
            product *= arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if (count > 1) {
                Arrays.fill(ans, 0);
                return ans;
            }
            if (isZero) {
                if (arr[i] == 0) ans[i] = product;
                else ans[i] = 0;
            } else {
                ans[i] = product / arr[i];
            }
        }

        return ans;
    }
}
