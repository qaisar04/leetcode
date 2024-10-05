package kz.baltabayev.leetcode;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = 0;

        while (left <= right) {
            int middle = right - (right - left) / 2;
            int middleValue = nums[middle];

            if (middleValue == target) {
                return middle;
            }

            if (middleValue < target) {
                left = middle + 1;
                index = left;
            } else {
                right = middle - 1;
            }
        }

        return index;
    }
}
