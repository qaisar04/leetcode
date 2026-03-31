package kz.baltabayev.leetcode.heap;

import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;
import kz.baltabayev.leetcode.utils.ListNode;

public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode();
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(Comparator.comparingInt(node -> node.val));

        for (ListNode node : lists) {
            if (!Objects.isNull(node)) {
                minHeap.add(node);
            }
        }

        ListNode tail = dummy;
        while (!minHeap.isEmpty()) {
            ListNode smallestNode = minHeap.poll();
            tail.next = smallestNode;

            if (smallestNode.next != null) {
                minHeap.add(smallestNode.next);
            }
            tail = tail.next;
        }

        return dummy.next;
    }
}
