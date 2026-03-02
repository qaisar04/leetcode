package kz.baltabayev.leetcode.leetcode_75.sliding_window;

import java.util.Arrays;

public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            s1Count[c - 'a']++;
        }

        int window = s1.length();
        int left = 0;
        for (int right = 0; right < s2.length(); right++) {
            char c = s2.charAt(right);
            s2Count[c - 'a']++;

            if (right - left + 1 == window) {
                if (Arrays.equals(s1Count, s2Count)) {
                    return true;
                }
                char removal = s2.charAt(left);
                s2Count[removal - 'a']--;
                left++;
            }
        }

        return false;
    }
}
