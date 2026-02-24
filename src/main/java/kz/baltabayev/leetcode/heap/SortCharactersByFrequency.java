package kz.baltabayev.leetcode.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap =
                new PriorityQueue<>(Map.Entry.<Character, Integer>comparingByValue().reversed());

        HashMap<Character, Integer> freq = new HashMap<>();
        char[] chars = s.toCharArray();

        for (char ch : chars) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        maxHeap.addAll(freq.entrySet());

        StringBuilder builder = new StringBuilder();

        while (!maxHeap.isEmpty()) {
            Entry<Character, Integer> entry = maxHeap.poll();
            builder.append(String.valueOf(entry.getKey()).repeat(Math.max(0, entry.getValue())));
        }

        return builder.toString();
    }
}
