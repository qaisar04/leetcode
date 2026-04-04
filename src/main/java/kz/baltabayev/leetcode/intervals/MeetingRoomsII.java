package kz.baltabayev.leetcode.intervals;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomsII {

    public static void main(String[] args) {
        MeetingRoomsII meetingRoomsII = new MeetingRoomsII();
        int[][] meetings = {
                {0, 30},
                {5, 10},
                {10, 20}
        };
        int rooms = meetingRoomsII.minMeetingRooms(meetings);
        System.out.print(rooms);
    }

    public int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0) return 0;

        Arrays.sort(intervals, (s, e) -> Integer.compare(s[0], e[0]));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) {
            int[] meeting = intervals[i];

            assert !minHeap.isEmpty();
            if (minHeap.peek() <= meeting[0]) {
                minHeap.poll();
            }
            minHeap.add(meeting[1]);
        }

        return minHeap.size();
    }
}
