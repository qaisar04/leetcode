package kz.baltabayev.leetcode.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FindMedianFromDataStream {

    private final PriorityQueue<Integer> minHeap;
    private final PriorityQueue<Integer> maxHeap;

    public FindMedianFromDataStream() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    }

    public void addNum(int num) {
        maxHeap.add(num);
        minHeap.add(maxHeap.poll());
        if (minHeap.size() > maxHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.isEmpty()) {
            throw new IllegalStateException("No elements");
        }

        if (maxHeap.size() > minHeap.size()) {
            return (double) maxHeap.peek();
        }
        return (double) (minHeap.peek() + maxHeap.peek()) / 2;
    }
}
