package kz.baltabayev.leetcode;

public class NeighboringBitwiseXOR {

    public boolean doesValidArrayExist(int[] derived) {
        int[] original = new int[derived.length];

        for (int i = 1; i < derived.length; i++) {
            original[i] = derived[i - 1] ^ original[i - 1];
        }

        for (int i = 0; i < derived.length; i++) {
            int xor;

            if (i == derived.length - 1) {
                xor = original[i] ^ original[0];
            } else {
                xor = original[i] ^ original[i + 1];
            }

            if (derived[i] != xor) return false;
        }

        return true;
    }
}
