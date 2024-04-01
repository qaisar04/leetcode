package kz.baltabayev.leetcode;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums == null) {
            return 0;
        }

        HashSet<Integer> numSet = new HashSet<>();
        for (int n : nums) {
            numSet.add(n);
        }

        int maxCount = 0;
        for (int num : numSet) {
            if(!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentCount = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentCount++;
                }

                maxCount = Math.max(maxCount, currentCount);
            }
        }

        return maxCount;
    }
}

