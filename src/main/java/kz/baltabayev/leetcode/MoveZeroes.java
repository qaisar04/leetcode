package kz.baltabayev.leetcode;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(nums);
        System.out.printf("result: %s", Arrays.toString(nums));
    }

    public void moveZeroes(int[] nums) {
        int i = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[i] = num;
                i++;
            }
        }

        while (i <= nums.length - 1) {
            nums[i] = 0;
            i++;
        }
    }
}
