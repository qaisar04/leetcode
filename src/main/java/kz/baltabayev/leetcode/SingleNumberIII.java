package kz.baltabayev.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        int[] result = new int[2];
        List<Integer> list = new ArrayList<>();

        for (int n : nums) {
            if (oneTime(n, nums)) {
                list.add(n);
            }
        }

        result[0] = list.get(0);
        result[1] = list.get(1);

        return result;
    }

    public boolean oneTime(int n, int[] nums) {
        int count = 0;

        for (int key : nums) {
            if (key == n) {
                count++;
            }
        }

        return count == 1;
    }
}
