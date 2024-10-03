package kz.baltabayev.leetcode;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            int middleValue = nums[middle];

            if (middleValue == target) {
                return middle; // target found
            }

            if (middleValue < target) {
                left = middle + 1; // search right half
            } else {
                right = middle - 1; // search left half
            }
        }

        return -1; // target not found
    }
}
