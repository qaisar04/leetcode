package kz.baltabayev.leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringMatchingInAnArray {

    public List<String> stringMatching(String[] words) {
        Set<String> match = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i == j) {
                    continue;
                }

                String first = words[i];
                String second = words[j];

                if (first.contains(second)) {
                    match.add(second);
                }
            }
        }

        return match.stream().toList();
    }
}
