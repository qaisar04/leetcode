package kz.baltabayev.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrences {

    public static void main(String[] args) {
        UniqueNumberOfOccurrences occurrences = new UniqueNumberOfOccurrences();
        boolean uniqueOccurrences = occurrences.uniqueOccurrences(new int[] {1, 2, 2, 1, 1, 3}); // false
    }

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        HashSet<Integer> integers = new HashSet<>(map.values());

        return integers.size() != map.size();
    }
}
