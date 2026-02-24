package kz.baltabayev.leetcode.heap;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        for (int num : nums) {
            numbers.add(num);
            if (numbers.size() > k) {
                numbers.poll();
            }
        }

        return numbers.peek();
    }
}
