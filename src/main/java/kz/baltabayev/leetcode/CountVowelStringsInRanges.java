package kz.baltabayev.leetcode;

public class CountVowelStringsInRanges {

    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] isVowel = new int[n];

        for (int i = 0; i < n; i++) {
            if (startsAndEndsWithVowel(words[i])) {
                isVowel[i] = 1;
            } else {
                isVowel[i] = 0;
            }
        }

        int[] prefix = new int[n];
        prefix[0] = isVowel[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + isVowel[i];
        }

        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];

            if (left > 0) {
                result[i] = prefix[right] - prefix[left - 1];
            } else {
                result[i] = prefix[right];
            }
        }

        return result;
    }

    public boolean startsAndEndsWithVowel(String word) {
        String vowel = "aeiou";
        return vowel.indexOf(word.charAt(0)) != -1 && vowel.indexOf(word.charAt(word.length() - 1)) != -1;
    }
}
