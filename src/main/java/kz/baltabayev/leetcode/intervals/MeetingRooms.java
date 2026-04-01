package kz.baltabayev.leetcode.intervals;

import java.util.Arrays;

public class MeetingRooms {

    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (s, e) -> Integer.compare(s[0], e[0])); // nlogn

        for (int i = 1; i < intervals.length; i++) {
            int[] prev = intervals[i - 1];
            int[] current = intervals[i];

            if (current[0] < prev[1]) {
                return false;
            }
        }
        return true;
    }
}
