package com.java.dailyChallengeLeetcode;

public class FindTheDifference_389 {
    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        System.out.println(findTheDifference(s,t));
    }

    public static  char findTheDifference(String s, String t) {
        char ans = ' ';
        for (int i = 0; i < t.length(); i++) {
            ans ^= t.charAt(i);
        }

        for (int i = 0; i < s.length(); i++) {
            ans ^= t.charAt(i);
        }

        return (char) (ans ^ ' ');
    }
}
