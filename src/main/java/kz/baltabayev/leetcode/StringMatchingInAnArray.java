package kz.baltabayev.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringMatchingInAnArray {

    public List<String> stringMatching(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));

        Set<String> substrings = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].contains(words[i])) {
                    substrings.add(words[i]);
                    break;
                }
            }
        }

        return new ArrayList<>(substrings);
    }
}
