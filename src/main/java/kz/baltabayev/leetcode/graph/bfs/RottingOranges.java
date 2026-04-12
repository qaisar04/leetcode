package kz.baltabayev.leetcode.graph.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {

    public int orangesRotting(int[][] grid) {
        int gridRow = grid.length, gridCol = grid[0].length;
        int numberOfMinutes = 0;

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        Queue<int[]> queue = new LinkedList<>();

        // phase 1 — collect all rotten oranges
        for (int row = 0; row < gridRow; row++) {
            for (int col = 0; col < gridCol; col++) {
                if (grid[row][col] == 2) {
                    queue.add(new int[] {row, col});
                }
            }
        }

        // phase 2 — multi-source BFS level by level
        while (!queue.isEmpty()) {
            int size = queue.size();

            boolean rotted = false;
            for (int i = 0; i < size; i++) {
                int[] poll = queue.poll();

                for (int[] dir : directions) {
                    int newRow = poll[0] + dir[0];
                    int newCol = poll[1] + dir[1];

                    if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length
                            && grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2;
                        queue.add(new int[] {newRow, newCol});
                        rotted = true;
                    }
                }
            }

            if (rotted) {
                numberOfMinutes++; // one full level done = one minute passed
            }
        }

        // phase 3 — check impossible case
        for (int row = 0; row < gridRow; row++) {
            for (int col = 0; col < gridCol; col++) {
                if (grid[row][col] == 1) {
                    return -1;
                }
            }
        }

        return numberOfMinutes;
    }
}
