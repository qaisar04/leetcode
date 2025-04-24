package kz.baltabayev.leetcode.leetcode_75.stack;

import java.util.Deque;
import java.util.LinkedList;

public class DecodeString {

    public static void main(String[] args) {
        DecodeString decodeString = new DecodeString();
        String result = decodeString.decodeString("3[a]2[bc]");
        System.out.println(result); // aaabcbc
    }

    public String decodeString(String s) {
        Deque<String> stack = new LinkedList<>();

        int retry = 0;

        int start = 0;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '[') {
                int j = i - 1;
                StringBuilder num = new StringBuilder();
                while (j >= 0 && Character.isDigit(chars[j])) {
                    num.insert(0, chars[j]);
                    j--;
                }
                retry = Integer.parseInt(num.toString());

                start = i;
            }

            if (chars[i] == ']') {
                String cut = s.substring(start + 1, i);

                while (retry > 0) {
                    stack.push(cut);
                    retry--;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        return result.toString();
    }
}
