package kz.baltabayev.leetcode;

public class MaximumScoreAfterSplittingAString {

    public int maxScore(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;

        if (n == 2) {
            if (chars[0] == '0' && chars[1] == '1') {
                return 2;
            } else if (chars[0] == '1' && chars[1] == '0') {
                return 0;
            } else {
                return 1;
            }
        }

        int right = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] == '1') right++;
        }

        int left = 0;
        int maxScore = 0;

        for (int i = 0; i < n; i++) {
            if (i == n -1) {
                break;
            }

            if (chars[i] == '0') {
                left++;
            } else {
                right--;
            }

            int sum = left + right;
            if (sum > maxScore) {
                maxScore = sum;
            }
        }

        return maxScore;
    }
}
