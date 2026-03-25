package kz.baltabayev.leetcode.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class RemoveStonesToMinimizeTheTotal {

    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pilesHeap = new PriorityQueue<>(Comparator.reverseOrder());

        pilesHeap.addAll(Arrays.stream(piles)
                .boxed()
                .toList());

        for (int i = 0; i < k; i++) {
            Integer stones = pilesHeap.poll();

            if (stones % 2 == 0) {
                pilesHeap.add(stones / 2);
            } else {
                pilesHeap.add((stones / 2) + 1);
            }
        }


        int sum = 0;
        while (!pilesHeap.isEmpty()) {
            sum += pilesHeap.poll();
        }

        return sum;
    }
}
