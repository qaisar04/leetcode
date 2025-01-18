package kz.baltabayev.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class ImplementStackUsingQueues {

    private Deque<Integer> dq;

    public ImplementStackUsingQueues() {
        dq = new LinkedList<>();
    }

    public void push(int x) {
        dq.addFirst(x);
    }

    public int pop() {
        return dq.removeFirst();
    }

    public int top() {
        return dq.getFirst();
    }

    public boolean empty() {
        return dq.isEmpty();
    }
}
