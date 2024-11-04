package kz.baltabayev.leetcode;

import java.util.LinkedList;

public class StringCompressionIII {

    public static void main(String[] args) {
        StringCompressionIII compression = new StringCompressionIII();

        // test case
        String first = compression.compressedString("aaaaaaaaaaaaaabb");
        String second = compression.compressedString("abcde");
        String third = compression.compressedString("aaaaaaaaay");

        System.out.println(first); // 9a5a2b
        System.out.println(second); // 1a1b1c1d1e
        System.out.println(third); // 9a1y
    }

    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();

        int counter = 1;
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                counter++;
                if (counter == 9) {
                    comp.append(9).append(word.charAt(i));
                    counter = 0;
                }
            } else {
                if (counter == 0) {
                    counter = 1;
                    continue;
                }

                comp.append(counter).append(word.charAt(i));
                counter = 1;
            }
        }

        if (counter != 0) {
            comp.append(counter).append(word.charAt(word.length() - 1));
        }

        return comp.toString();
    }
}
