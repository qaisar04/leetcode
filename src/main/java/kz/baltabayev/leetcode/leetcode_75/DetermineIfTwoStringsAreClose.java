package kz.baltabayev.leetcode.leetcode_75;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DetermineIfTwoStringsAreClose {

    public static void main(String[] args) {
        DetermineIfTwoStringsAreClose determineIfTwoStringsAreClose = new DetermineIfTwoStringsAreClose();
        boolean isClose = determineIfTwoStringsAreClose.closeStrings("cabbba", "abbccc");
    }

    public boolean closeStrings(String word1, String word2) {
        if (word2.length() != word1.length()) return false;

        HashMap<Character, Integer> frequencyFirstCounter = new HashMap<>();
        for (char c : word1.toCharArray()) {
            frequencyFirstCounter.put(c, frequencyFirstCounter.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> frequencySecondCounter = new HashMap<>();
        for (char c : word2.toCharArray()) {
            frequencySecondCounter.put(c, frequencySecondCounter.getOrDefault(c, 0) + 1);
            if(!frequencyFirstCounter.containsKey(c)) {
                return false;
            }
        }

        Map<Character, Integer> freq1 = new HashMap<>();
        for (char c : word1.toCharArray()) {
            freq1.put(c, freq1.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> freq2 = new HashMap<>();
        for (char c : word2.toCharArray()) {
            freq2.put(c, freq2.getOrDefault(c, 0) + 1);
        }

        if (!freq1.keySet().equals(freq2.keySet())) {
            return false;
        }

        List<Integer> counts1 = new ArrayList<>(freq1.values());
        List<Integer> counts2 = new ArrayList<>(freq2.values());

        Collections.sort(counts1);
        Collections.sort(counts2);

        return counts1.equals(counts2);
    }
}
