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
        char[] array = word.toCharArray();
        LinkedList<String> comp = new LinkedList<>();

        int counter = 1;
        for (int i = 0; i < word.length() - 1; i++) {
            if (counter == 9 && array[i] == array[i + 1]) {
                comp.add(String.valueOf(counter));
                comp.add(String.valueOf(array[i]));
                counter = 0;
            }

            if (array[i] == array[i + 1]) {
                counter++;
            } else {
                comp.add(String.valueOf(counter));
                comp.add(String.valueOf(array[i]));
                counter = 1;
            }
        }

        comp.add(String.valueOf(counter));
        comp.add(String.valueOf(array[word.length() - 1]));

        return String.join("", comp);
    }
}
