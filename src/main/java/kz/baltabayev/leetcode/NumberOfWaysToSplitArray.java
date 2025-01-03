package kz.baltabayev.leetcode;

import java.util.Arrays;

public class NumberOfWaysToSplitArray {

    public static void main(String[] args) {
        int[] nums = {10, 4, -8, 7};

        NumberOfWaysToSplitArray waysToSplitArray = new NumberOfWaysToSplitArray();
        int result = waysToSplitArray.waysToSplitArray(nums);
        System.out.println(result); // 2
    }

    public int waysToSplitArray(int[] nums) {
        long totalSum = Arrays.stream(nums).asLongStream().sum();

        int validIndexCount = 0;
        long leftSum = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            long rightSum = totalSum - leftSum;

            if (leftSum >= rightSum) {
                validIndexCount++;
            }
        }

        return validIndexCount;
    }
}
