package kz.baltabayev.leetcode.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargest {

    private final PriorityQueue<Integer> minHeap;
    private final int k;

    public KthLargest(int k, int[] nums) {
        this.minHeap = new PriorityQueue<>();
        this.k = k;

        minHeap.addAll(Arrays.stream(nums)
                .boxed()
                .toList());

        while (minHeap.size() > this.k) {
            minHeap.poll();
        }
    }

    public int add(int val) {
        minHeap.add(val);
        if (minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
