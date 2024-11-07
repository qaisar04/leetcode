package kz.baltabayev.leetcode;

public class LargestCombinationWithBitwiseANDGreaterThanZero {

    public static void main(String[] args) {
        LargestCombinationWithBitwiseANDGreaterThanZero combination = new LargestCombinationWithBitwiseANDGreaterThanZero();

        int[] nums1 = {16, 17, 71, 62, 12, 24, 14};
        int largested = combination.largestCombination(nums1);
        System.out.println(largested);
    }

    public int largestCombination(int[] candidates) {
        int[] counts = new int[32];

        for (int num : candidates) {
            for (int i = 0; i < 32; i++) {
                if ((num & (1 << i)) != 0) { // если бит равен 1
                    counts[i]++; // увеличиваем счетчик для этой позиции
                }
            }
        }

        int maxCount = 0;
        for (int count : counts) {
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}
