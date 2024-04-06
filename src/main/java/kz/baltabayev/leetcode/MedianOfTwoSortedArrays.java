package kz.baltabayev.leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : nums1) {
            list.add(i);
        }
        for (int i : nums2) {
            list.add(i);
        }

        Collections.sort(list);
        int size = list.size();
        if (size % 2 == 1) {
            return (double) list.get((size - 1) / 2);
        }

        return (double) (list.get(size / 2) + list.get(size / 2 - 1)) / 2;
    }
}
