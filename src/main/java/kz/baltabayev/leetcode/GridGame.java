package kz.baltabayev.leetcode;

public class GridGame {

    public static void main(String[] args) {
        GridGame game = new GridGame();
        int[][] grid = new int[][]{{2, 5, 4}, {1, 5, 1}};
        System.out.println(game.gridGame(grid));
    }

    public long gridGame(int[][] grid) {
        int n = grid[0].length;

        long[] upperPrefixSum = new long[n];
        long[] lowerPrefixSum = new long[n];

        // 1. Заполняем префиксы
        upperPrefixSum[0] = grid[0][0];
        lowerPrefixSum[0] = grid[1][0];
        for (int i = 1; i < n; i++) {
            upperPrefixSum[i] = upperPrefixSum[i - 1] + grid[0][i];
            lowerPrefixSum[i] = lowerPrefixSum[i - 1] + grid[1][i];
        }

        // 2. Нужно теперь рассчитать минимальное кол-во очков для второго робота
        long minSecondRobotPoints = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            long pointAbove = i + 1 < n ? upperPrefixSum[n - 1] - upperPrefixSum[i] : 0;
            long pointBelow = i > 0 ? lowerPrefixSum[i - 1] : 0;
            long secondRobotPoints = Math.max(pointAbove, pointBelow);

            minSecondRobotPoints = Math.min(minSecondRobotPoints, secondRobotPoints);
        }

        return minSecondRobotPoints;
    }
}
