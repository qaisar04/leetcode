package kz.baltabayev.leetcode;

public class BinarySearch {
    public int search(int[] nums, int target) {
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
}