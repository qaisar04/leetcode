package kz.baltabayev.leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int duplicates = removeDuplicates(new int[]{1, 1, 2, 3, 4, 4, 9, 1});
        System.out.println(duplicates);
    }

    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.stream(nums).forEach(set::add);

        return nums.length - set.size();
    }
}
