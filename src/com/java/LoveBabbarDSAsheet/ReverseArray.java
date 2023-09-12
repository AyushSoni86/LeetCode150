package com.java.LoveBabbarDSAsheet;

import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class ReverseArray {
    public static void reverseArray(ArrayList<Integer> arr, int m) {
       int j = arr.size()-1;
       int i = m;
        while (i < j) {
            int first = arr.get(i);
            int last = arr.get(j);
            arr.set(i++, last);
            arr.set(j--, first);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);

//        list.set(2,100);
        reverseArray(list, 3);
        System.out.println(list);
    }
}
