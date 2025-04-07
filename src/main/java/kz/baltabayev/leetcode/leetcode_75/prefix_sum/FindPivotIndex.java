package kz.baltabayev.leetcode.leetcode_75.prefix_sum;

public class FindPivotIndex {

    public static void main(String[] args) {
        FindPivotIndex pivotIndex = new FindPivotIndex();
        int pivoted = pivotIndex.pivotIndex(new int[] {1, 7, 3, 6, 5, 6});
        System.out.printf("%d", pivoted);
    }

    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int[] leftSum = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
            leftSum[i] = i == 0 ? 0 : leftSum[i - 1] + nums[i - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (leftSum[i] == totalSum - leftSum[i] - nums[i]) {
                return i;
            }
        }

        return -1;
    }
}
