package com.java.Leetcode150.day5;

public class JumpGame_55 {

//    Example 1:
//    Input: nums = [2,3,1,1,4]
//    Output: true
//    Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

//    Example 2:
//    Input: nums = [3,2,1,0,4]
//    Output: false
//    Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.


    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 1, 4};
        int[] arr2 = {3, 2, 1, 0, 4};
        System.out.println(canJump(arr1));
        System.out.println(canJump(arr2));
    }

    public static boolean canJump(int[] arr) {
        int finalIndex = arr.length - 1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (i + arr[i] >= finalIndex)
                finalIndex = i;
        }
        return finalIndex == 0;
    }
}
