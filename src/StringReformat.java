import java.util.*;

public class StringReformat {

    public static String reformatWords(String s) {
        String[] words = s.split("\\s+");
        String[] ans = new String[words.length];
        for (String word : words) {
            int index = extractNumber(word);
            ans[index - 1] = word.replaceAll("\\d", "");
        }
        return String.join(" ", ans);
    }

    public static int extractNumber(String input) {
        StringBuilder number = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                number.append(c);
            }
        }
        if (!number.isEmpty()) {
            return Integer.parseInt(number.toString());
        }
        return 0;
    }

    public static void main(String[] args) {
        String input1 = "th1is 3a chat4gpt i2s";
        String input2 = "1a 2b 3c 4d 5e 6f 7g 8h 9i 10j";
        String input3 = "1word 2with 3numbers 4and 5letters";
        String input4 = "a2 b3 4c d1 e5";
        String input5 = "5quick 4brown 3fox 2jumps 1over";
        String input6 = "hello3 2world 1java";
        String input7 = "th1is 3a chat4gpt i2s hello8 11world 6java 5quick 7brown 12fox 9jumps 10over";
        System.out.println(reformatWords(input1));
        System.out.println(reformatWords(input2));
        System.out.println(reformatWords(input3));
        System.out.println(reformatWords(input4));
        System.out.println(reformatWords(input5));
        System.out.println(reformatWords(input6));
        System.out.println(reformatWords(input7));
    }

}




