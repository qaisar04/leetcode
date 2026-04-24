package kz.baltabayev.leetcode.graph.bfs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class KeysAndRooms {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();

        Queue<Integer> queue = new LinkedList<>(rooms.get(0));
        visited.add(0);

        while (!queue.isEmpty()) {
            Integer accessibleRoom = queue.poll();

            if (visited.contains(accessibleRoom)) continue;

            List<Integer> accessibleRoomKeys = rooms.get(accessibleRoom);
            queue.addAll(accessibleRoomKeys);
            visited.add(accessibleRoom);
        }

        return visited.size() == rooms.size();

    }
}
