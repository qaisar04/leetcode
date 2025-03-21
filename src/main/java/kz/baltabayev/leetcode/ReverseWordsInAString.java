package kz.baltabayev.leetcode;

public class ReverseWordsInAString {

    public String reverseWords(String s) {
        String result = s.trim().replaceAll("\\s+", " ");
        String[] words = result.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);

            if (i != words.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
