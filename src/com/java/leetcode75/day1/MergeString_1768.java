package com.java.leetcode75.day1;

public class MergeString_1768 {
//    Example 1:
//    Input: word1 = "abc", word2 = "pqr"
//    Output: "apbqcr"
//    Explanation: The merged string will be merged as so:
//    word1:  a   b   c
//    word2:    p   q   r
//    merged: a p b q c r

//    Example 2:
//    Input: word1 = "ab", word2 = "pqrs"
//    Output: "apbqrs"
//    Explanation: Notice that as word2 is longer, "rs" is appended to the end.
//            word1:  a   b
//    word2:    p   q   r   s
//    merged: a p b q   r   s

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqrstu";
        System.out.println(mergeAlternately_1(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        String ans = "";
        int minlength = Math.min(word1.length(), word2.length());
        int maxlength = Math.max(word1.length(), word2.length());
        for (int i = 0; i < minlength; i++) {
            ans += word1.charAt(i);
            ans += word2.charAt(i);
        }

        for (int i = minlength; i < maxlength; i++) {
            if (word1.length() > word2.length()) ans += word1.charAt(i);
            else ans += word2.charAt(i);
        }
        return ans;
    }

    public static String mergeAlternately_1(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < Math.max(m, n); i++) {
            if (i < m) result.append(word1.charAt(i));
            if (i < n) result.append(word2.charAt(i));
        }
        return result.toString();
    }
}
