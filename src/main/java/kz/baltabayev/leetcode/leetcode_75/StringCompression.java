package kz.baltabayev.leetcode.leetcode_75;

import java.util.HashMap;

public class StringCompression {

    public static void main(String[] args) {
        StringCompression stringCompression = new StringCompression();
        int compressed = stringCompression.compress(new char[] {'a', 'a', 'b', 'b', 'c', 'c', 'c'});
        System.out.println(compressed);
    }

    public int compress(char[] chars) {
        int index = 0;
        int i = 0;

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            chars[index++] = currentChar;

            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }
}
