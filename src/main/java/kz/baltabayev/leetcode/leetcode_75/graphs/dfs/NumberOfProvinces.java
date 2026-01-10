package kz.baltabayev.leetcode.leetcode_75.graphs.dfs;

import java.util.HashSet;
import java.util.Set;

public class NumberOfProvinces {

    public int findCircleNum(int[][] isConnected) {
        Set<Integer> visited = new HashSet<>();

        int provinces = 0;
        for (int city = 0; city < isConnected.length; city++) {
            if (!visited.contains(city)) {
                dfs(isConnected, city, visited);
                provinces++;
            }
        }

        return provinces;
    }

    private void dfs(int[][] isConnected, int currentCity, Set<Integer> visited) {
        visited.add(currentCity);

        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[currentCity][i] == 1 && !visited.contains(i)) {
                dfs(isConnected, i, visited);
            }
        }
    }
}
