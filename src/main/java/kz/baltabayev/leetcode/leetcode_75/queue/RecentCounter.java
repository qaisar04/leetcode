package kz.baltabayev.leetcode.leetcode_75.queue;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {

    private final Queue<Integer> recentRequests;

    public RecentCounter() {
        recentRequests = new LinkedList<>();
    }

    public int ping(int t) {
        recentRequests.add(t);
        return (int) recentRequests.stream()
                .filter(call -> this.isValid(call, t))
                .count();
    }

    private boolean isValid(int call, int t) {
        return t - 3000 <= call && call <= t;
    }
}
