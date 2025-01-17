package kz.baltabayev.leetcode;

public class NeighboringBitwiseXOR {

    public boolean doesValidArrayExist(int[] derived) {
        int n = derived.length;
        int[] original = new int[n];

        for (int i = 1; i < n; i++) {
            original[i] = derived[i - 1] ^ original[i - 1];
        }

        for (int i = 0; i < n; i++) {
            int xor;

            if (i == n - 1) {
                xor = original[i] ^ original[0];
            } else {
                xor = original[i] ^ original[i + 1];
            }

            if (derived[i] != xor) return false;
        }

        return true;
    }
}
