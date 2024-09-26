package kz.baltabayev.leetcode;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        String last = strs[strs.length - 1];
        return last.length();
    }
}
