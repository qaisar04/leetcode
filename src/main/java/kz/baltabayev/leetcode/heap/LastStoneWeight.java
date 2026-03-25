package kz.baltabayev.leetcode.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

public class LastStoneWeight {

    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        new LastStoneWeight().lastStoneWeight(stones);
    }

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());

        heap.addAll(Arrays.stream(stones)
                .boxed()
                .toList());

        while (heap.size() > 1) {
            Integer first = heap.poll();
            Integer second = heap.poll();

            if (!Objects.equals(first, second)) {
                heap.add(first - second);
            }
        }

        if (heap.isEmpty()) {
            return 0;
        }

        return heap.peek();
    }
}
