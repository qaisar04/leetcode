package kz.baltabayev.leetcode.grokaem_algorithms;

public class BinarySearch {

    // O(logn)
    public int search(int[] nums, int target) {
        if (isListEmpty(nums)) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int guess = nums[mid];

            if (guess == target) return mid;
            else if (guess > target) right = mid - 1;
            else left = mid + 1;
        }

        return -1;
    }

    public boolean isListEmpty(int[] myList) {
        int listSize = myList.length;
        if (listSize == 0) {
            return true;
        }
        return false;
    }
}
