package com.java.day3;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements_169 {
    //    Given an array nums of size n, return the majority element.
//    The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

//    Example 1:
//    Input: nums = [3,2,3]
//    Output: 3

    //    Example 2:
//    Input: nums = [2,2,1,1,1,2,2]
//    Output: 2
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int[] arr1 = {3, 2, 3};
        System.out.println(majorityElement(arr));
        System.out.println(majorityElement(arr1));
    }

    public static int majorityElement(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) map.put(arr[i], 1);
            else map.put(arr[i], map.get(arr[i]) + 1);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > arr.length / 2) ans = entry.getKey();
        }
        return ans;
    }


    public static int majorityElement_1(int[] arr) {
        int count = 0;
        int major = 0;
        for (int element : arr) {
            if (count == 0) major = element;
            if (element == major) count++;
            else count--;
        }
        return major;
    }
}
