package kz.baltabayev.leetcode;

public class SingleNumberII {
    public int singleNumber(int[] nums) {
        for (int n : nums) {
            if (oneTime(n, nums)) {
                return n;
            }
        }

        return -1;
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
