package com.java.Leetcode150.day4;

import java.util.ArrayList;
import java.util.Arrays;

public class BestTimeToBuyStock_121 {
    //    Example 1:
//    Input: prices = [7,1,5,3,6,4]
//    Output: 5
//    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//    Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//
//    Example 2:
//    Input: prices = [7,6,4,3,1]
//    Output: 0
//    Explanation: In this case, no transactions are done and the max profit = 0.
    public static void main(String[] args) {
        int[] arr1 = {7, 1, 5, 3, 6, 4};
        int[] arr2 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(arr1));
        System.out.println(maxProfit(arr2));
    }

    public static int maxProfit(int[] arr) {
        return maxProfit_3(arr);
    }

    static int maxProfit_1(int[] arr) {
        int maxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int profit = arr[j] - arr[i];
                if (profit > maxProfit) maxProfit = profit;
            }
        }
        return maxProfit;
    }

    static int maxProfit_2(int[] arr) {
        int maxProfit = 0;
        int[] aux = new int[arr.length];
        aux[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            aux[i] = Math.min(aux[i - 1], arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            int profit = arr[i] - aux[i];
            if (profit > maxProfit) maxProfit = profit;
        }
        return maxProfit;
    }

    static int maxProfit_3(int[] arr) {
        int maxProfit = 0;
        int minSoFar = arr[0];
        for (int i = 0; i < arr.length; i++) {
            minSoFar = Math.min(minSoFar, arr[i]);
            int profit = arr[i] - minSoFar;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
