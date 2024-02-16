package kz.baltabayev.leetcode;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sCharArray = s.toCharArray();
        Arrays.sort(sCharArray);
        String sSort = new String(sCharArray);

        char[] tCharArray = t.toCharArray();
        Arrays.sort(tCharArray);
        String tSort = new String(tCharArray);

        return sSort.equals(tSort);
    }
}
