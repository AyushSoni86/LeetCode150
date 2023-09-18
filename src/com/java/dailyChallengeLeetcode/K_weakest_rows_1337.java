package com.java.dailyChallengeLeetcode;

import java.util.Arrays;

public class K_weakest_rows_1337 {
    public static void main(String[] args) {

    }
    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[k];
        int i =0;
        for(int[] arr: mat){
            ans[i++] = findSoldier(arr);
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }

    static int findSoldier(int[] arr){
        int count = 0;
        for(int val: arr){
            if (val == 1)count++;
        }
        return count;
    }
}
