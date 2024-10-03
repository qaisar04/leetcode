package kz.baltabayev.leetcode;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

        int index = -1;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                return i;
            }

            if (nums[i] < target) {
                index = i + 1;
            } else {
                index = i - 1;
            }
        }

        return index;
    }
}
