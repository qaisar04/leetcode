package kz.baltabayev.leetcode;

public class Search2DMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{5, 2}, {4, 1}};
        boolean isFound = searchMatrix(matrix, 1);
        System.out.println(isFound); // true
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean isFound = false;

        for (int[] row : matrix) {
            int left = 0;
            int right = matrix[0].length - 1;

            while (left <= right) {
                int middle = right - (right - left) / 2;
                int middleValue = row[middle];

                if (target == middleValue) {
                    return true;
                }

                if (middleValue < target) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        }


        return isFound;
    }
}
