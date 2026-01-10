package kz.baltabayev.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {

    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> cnt = new HashMap<>();

        int left = 0, ans = -1;
        for (int right = 0; right < fruits.length; right++) {
            cnt.put(fruits[right], cnt.getOrDefault(fruits[right], 0) + 1);
            while (cnt.size() > 2) {
                int count = cnt.get(fruits[left]) - 1;
                if (count == 0) {
                    cnt.remove(fruits[left]);
                } else {
                    cnt.put(fruits[left], count - 1);
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }

}
