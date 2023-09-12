package com.java.LoveBabbarDSAsheet;

import java.util.* ;
import java.io.*; 
public class SumOfMaxMin {
  public static int sumOfMaxMin(int[] arr, int n) {
      int ans = 0;
      int max = arr[0];
      int min = arr[0];
      for (int i = 0; i < arr.length; i++) {
        if(arr[i]> max) max = arr[i];
        else if(arr[i] < min) min = arr[i];
      }
      
      return max+min;
  }
}