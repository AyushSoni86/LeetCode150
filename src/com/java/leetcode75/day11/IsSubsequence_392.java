package com.java.leetcode75.day11;

public class IsSubsequence_392 {
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
//        String s = "axc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length())
            if (s.charAt(i) == t.charAt(j++))
                i++;
        return i == s.length();
    }
}
