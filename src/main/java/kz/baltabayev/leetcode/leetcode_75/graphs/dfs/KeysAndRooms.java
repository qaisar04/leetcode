package kz.baltabayev.leetcode.leetcode_75.graphs.dfs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();
        dfs(rooms, 0, visited);
        return visited.size() == rooms.size();
    }

    private void dfs(List<List<Integer>> rooms, int currentRoom, Set<Integer> visited) {
        visited.add(currentRoom);

        rooms.get(currentRoom).forEach(room -> {
            if (!visited.contains(room)) {
                dfs(rooms, room, visited);
            }
        });
    }
}
