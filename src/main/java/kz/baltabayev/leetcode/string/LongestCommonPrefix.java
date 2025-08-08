package kz.baltabayev.leetcode.string;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 0; i < strs.length - 1; i++) {
            String second = strs[i + 1];
            prefix = getCommonPrefix(prefix, second);
        }

        return prefix;
    }

    private String getCommonPrefix(String first, String second) {
        int minLength = Math.min(first.length(), second.length());
        StringBuilder commonPrefix = new StringBuilder();

        for (int i = 0; i < minLength; i++) {
            if (first.charAt(i) != second.charAt(i)) {
                break;
            }
            commonPrefix.append(first.charAt(i));
        }

        return commonPrefix.toString();
    }
}
