package kz.baltabayev.leetcode.leetcode_75.sliding_window;

import java.util.Set;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {

    public int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        int max = 0;
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                max++;
            }
        }

        int count = max;
        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i - k))) {
                count--;
            }
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
            max = Math.max(max, count);
        }

        return max;
    }
}
