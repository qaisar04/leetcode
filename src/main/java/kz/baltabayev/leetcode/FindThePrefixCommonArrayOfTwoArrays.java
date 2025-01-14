package kz.baltabayev.leetcode;

import java.util.HashSet;
import java.util.Set;

public class FindThePrefixCommonArrayOfTwoArrays {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;

        Set<Integer> seenInA = new HashSet<>();
        Set<Integer> seenInB = new HashSet<>();
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            seenInA.add(A[i]);
            seenInB.add(B[i]);

            Set<Integer> intersection = new HashSet<>(seenInA);
            intersection.retainAll(seenInB);
            result[i] = intersection.size();
        }

        return result;
    }
}
