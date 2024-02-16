package kz.baltabayev.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            String sortedStr = sort(str);
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }

            map.get(sortedStr).add(str);
        }

        return map.values().stream().toList();
    }

    public String sort(String unsortedStr) {
        char[] charArray = unsortedStr.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
