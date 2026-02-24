package kz.baltabayev.leetcode.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(Map.Entry.comparingByValue());

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> el : freq.entrySet()) {
            minHeap.add(el);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.stream().mapToInt(Map.Entry::getKey).toArray();
    }
}
