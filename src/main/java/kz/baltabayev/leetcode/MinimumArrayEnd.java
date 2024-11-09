package kz.baltabayev.leetcode;

public class MinimumArrayEnd {

    public static void main(String[] args) {
        MinimumArrayEnd minimumArrayEnd = new MinimumArrayEnd();
        long minEnd = minimumArrayEnd.minEnd(3, 5);
        System.out.println(minEnd);
    }

    public long minEnd(int n, int x) {
        long result = x;
        long remaining = n - 1;
        long position = 1;

        while (remaining != 0) {
            if ((x & position) == 0) {
                result |= (remaining & 1) * position;
                remaining >>= 1;
            }
            position <<= 1;
        }

        return result;
    }

//    -- Time Limit Exceeded --

//    public long minEnd(int n, int x) {
//        int[] nums = new int[n];
//        nums[0] = x;
//
//        for (int i = 1; i < n; i++) {
//            int nextNum = nums[i - 1] + 1;
//
//            while ((nextNum & x) != x) {
//                nextNum++;
//            }
//
//            nums[i] = nextNum;
//        }
//
//        return nums[n - 1];
//    }
}
