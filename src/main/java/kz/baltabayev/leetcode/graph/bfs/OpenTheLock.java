package kz.baltabayev.leetcode.graph.bfs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import kz.baltabayev.leetcode.heap.IPO.Pair;

public class OpenTheLock {

    public int openLock(String[] deadends, String target) {
        Set<String> visited = new HashSet<>(Arrays.asList(deadends));
        Queue<String> queue = new LinkedList<>();

        int result = 0;

        String start = "0000";
        if (visited.contains(start)) return -1;

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            int size = queue.size();        // snapshot current level size

            for (int i = 0; i < size; i++) {
                String poll = queue.poll();

                if (target.equals(poll)) {
                    return result;
                }

                for (int j = 0; j < 4; j++) {
                    assert poll != null;
                    String turnedUp = turn(poll, j, 1);
                    String turnedDown = turn(poll, j, -1);

                    if (!visited.contains(turnedUp)) {
                        queue.add(turnedUp);
                        visited.add(turnedUp);
                    }
                    if (!visited.contains(turnedDown)) {
                        queue.add(turnedDown);
                        visited.add(turnedDown);
                    }
                }
            }
            result++;
        }

        return -1;
    }

    private String turn(String current, int index, int direction) {
        char[] chars = current.toCharArray();
        chars[index] = (char) ((chars[index] - '0' + direction + 10) % 10 + '0');
        return new String(chars);
    }
}
