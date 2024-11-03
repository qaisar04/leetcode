package kz.baltabayev.leetcode;

public class CircularSentence {

    public static void main(String[] args) {
        CircularSentence sentence = new CircularSentence();
        boolean result = sentence.isCircularSentence("Leetcode eisc cool");
        System.out.println(result);
    }

    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");

        if (words.length == 1) {
            char[] chars = words[0].toCharArray();
            return chars[0] == chars[chars.length - 1];
        }

        for (int i = 0; i < words.length - 1; i++) {
            char[] first = words[i].toCharArray();
            char[] second = words[i + 1].toCharArray();

            if (first[first.length - 1] != second[0]) {
                return false;
            }
        }

        char[] last = words[words.length - 1].toCharArray();
        char[] first = words[0].toCharArray();
        return last[last.length - 1] == first[0];
    }
}
