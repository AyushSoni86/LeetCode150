package com.java.leetcode75.day6;

import java.util.Arrays;

public class ReverseWords_151 {
//    Example 1:
//    Input: s = "the sky is blue"
//    Output: "blue is sky the"
//
//    Example 2:
//    Input: s = "  hello world  "
//    Output: "world hello"
//    Explanation: Your reversed string should not contain leading or trailing spaces.

    //    Example 3:
//    Input: s = "a good   example"
//    Output: "example good a"
//    Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
    public static void main(String[] args) {
        String s1 = "the sky is blue";
        String s2 = "  hello world  ";
        String s3 = "a good   example";
        System.out.println(reverseWords(s1));
        System.out.println(reverseWords(s2));
        System.out.println(reverseWords(s3));

    }

    public static String reverseWords(String str) {
        String ans = "";
        String[] words = str.trim().split("\\s+");
        for (int i = words.length - 1; i > 0; i--) {
            ans += words[i] + ' ';
        }
        return ans + words[0];
    }

//    static String removeSpaces(String str) {
//
//    }
}
