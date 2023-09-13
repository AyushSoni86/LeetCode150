package com.java.leetcode75.day5;

class ReverseVowels_345 {

//    Example 1:
//    Input: s = "hello"
//    Output: "holle"

    //    Example 2:
//    Input: s = "leetcode"
//    Output: "leotcede"
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "leetcode";
//        System.out.println(reverse(vowelSeparate(str1)));
//        System.out.println(vowelSeparate(str2));
        System.out.println(reverseVowels(str1));
        System.out.println(reverseVowels(str2));
        System.out.println(reverseVowels("aA"));
//        System.out.println();
    }

    public static String reverseVowels(String str) {
        return reverseVowel_2(str);
    }

    public static String reverseVowel_1(String str) {
        String vowel = reverse(vowelSeparate(str));
        int j = 0;
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isVowel(ch)) newStr += vowel.charAt(j++);
            else newStr += ch;
        }
        return newStr;
    }

    public static String reverseVowel_2(String str) {
        char[] arr = str.toCharArray();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (isVowel(arr[i]) && isVowel(arr[j])) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if (!isVowel(arr[i])) i++;
            else if (!isVowel(arr[j])) j--;
        }
        return toString(arr);
    }

    public static String toString(char[] a) {
        String str = new String(a);
        return str;
    }
    static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        } else return false;
    }

    static String vowelSeparate(String str) {
        String vowel = "";
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i)))
                vowel += str.charAt(i);
        }
        return vowel;
    }


    static String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

}