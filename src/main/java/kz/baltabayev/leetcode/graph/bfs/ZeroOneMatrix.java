package kz.baltabayev.leetcode.graph.bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ZeroOneMatrix {

    public int[][] updateMatrix(int[][] mat) {
        int[][] distance = new int[mat.length][mat[0].length];

        for (int[] row : distance) {
            Arrays.fill(row, -1);
        }

        Queue<int[]> queue = new LinkedList<>();
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (mat[row][col] == 0) {
                    distance[row][col] = 0;
                    queue.add(new int[] {row, col});
                }
            }
        }

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();

            for (int[] dir : directions) {
                int newRow = poll[0] + dir[0];
                int newCol = poll[1] + dir[1];

                if (newRow >= 0 && newCol >= 0 && newRow < mat.length && newCol < mat[0].length
                        && distance[newRow][newCol] == -1) {
                    distance[newRow][newCol] = distance[poll[0]][poll[1]] + 1;
                    queue.add(new int[] {newRow, newCol});
                }
            }
        }

        return distance;
    }
}
