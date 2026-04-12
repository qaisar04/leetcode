package kz.baltabayev.leetcode.graph.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class MaxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int maxArea = 0;

        Queue<int[]> queue = new LinkedList<>();

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        int currentArea = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 1 && !visited[row][col]) {
                    queue.add(new int[] {row, col});
                    visited[row][col] = true;
                    currentArea++;

                    while (!queue.isEmpty()) {
                        int[] poll = queue.poll();

                        for (int[] dir : directions) {
                            int newRow = poll[0] + dir[0];
                            int newCol = poll[1] + dir[1];

                            if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length
                                    && !visited[newRow][newCol] && grid[newRow][newCol] == 1) {
                                visited[newRow][newCol] = true;
                                queue.add(new int[] {newRow, newCol});
                                currentArea++;
                            }
                        }
                    }
                    maxArea = Math.max(currentArea, maxArea);
                    currentArea = 0;
                }
            }
        }

        return maxArea;
    }
}
