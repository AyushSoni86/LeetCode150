package com.java.leetcode75.day4;

class CanPlaceFlowers_605 {

//    Example 1:
//    Input: flowerbed = [1,0,0,0,1], n = 1
//    Output: true

    //    Example 2:
//    Input: flowerbed = [1,0,0,0,1], n = 2
//    Output: false

    public static void main(String[] args) {
        int[] arr1 = {1, 0, 0, 0, 1};
        int[] arr2 = {0, 0, 1, 0, 1};
        System.out.println(canPlaceFlowers(arr1, 1));
        System.out.println(canPlaceFlowers(arr2, 1));
    }

    public static boolean canPlaceFlowers(int[] arr, int n) {
        if (n == 0) return true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 &&
                    (i == 0 || arr[i - 1] == 0) &&
                    (i == arr.length - 1 || arr[i + 1] == 0)) {
                n--;
                if (n == 0) return true;
                arr[i] = 1;

            }
        }
        return false;
    }
}