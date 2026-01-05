package kz.baltabayev.leetcode;

public class MaximumAverageSubarrayI {

    public static double findMaxAverage(int[] nums, int k) {
        int state = 0;

        for (int start = 0; start < k; start++) {
            state += nums[start];
        }

        int result = state;
        for (int end = k; end < nums.length; end++) {
            state += nums[end];        // зашёл новый справа
            state -= nums[end - k];    // вышел старый слева
            result = Math.max(result, state);
        }

        return (double) result / k;
    }

    public static void main(String[] args) {
        double result = findMaxAverage(new int[] {1, 2, 3, 4, 5}, 4);
        System.out.println(result);
    }
}
