package com.java.leetcode75.day2;

class GcdOfStrings_1071 {

//    Example 1:
//
//    Input: str1 = "ABCABC", str2 = "ABC"
//    Output: "ABC"
//    Example 2:
//
//    Input: str1 = "ABABAB", str2 = "ABAB"
//    Output: "AB"
//    Example 3:
//
//    Input: str1 = "LEET", str2 = "CODE"
//    Output: ""

    public static void main(String[] args) {
//        String str1 = "ABCABC", str2 = "ABC";
        String str1 = "ABABAB", str2 = "ABAB";
//        String str1 = "LEET", str2 = "CODE";
        System.out.println(gcdOfStrings(str1, str2));
    }

    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";
        else return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    static int gcd(int a, int b) {
        return (a % b == 0) ? b : gcd(b, a % b);
    }

}