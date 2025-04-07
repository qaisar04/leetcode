package kz.baltabayev.leetcode.leetcode_75.prefix_sum;

public class FindTheHighestAltitude {

    public int largestAltitude(int[] gain) {
        int[] prefixSum = new int[gain.length];
        int maxAltitude = 0;

        for (int i = 0; i < gain.length; i++) {
            prefixSum[i] = i == 0 ? gain[i] : gain[i] + prefixSum[i - 1];
            maxAltitude = Math.max(maxAltitude, prefixSum[i]);
        }

        return maxAltitude;
    }
}
