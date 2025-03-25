package kz.baltabayev.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {

    public static void main(String[] args) {
        FindTheDifferenceOfTwoArrays difference = new FindTheDifferenceOfTwoArrays();
        List<List<Integer>> results = difference.findDifference(new int[] {1, 2, 3}, new int[] {2, 4, 6});
        System.out.println(results);
    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> diff1 = new ArrayList<>(set1);
        diff1.removeAll(set2);

        List<Integer> diff2 = new ArrayList<>(set2);
        diff2.removeAll(set1);

        return List.of(diff1, diff2);
    }
}
