package kz.baltabayev.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            if (!map.containsKey(n)) {
                map.put(n, 0);
            }

            int i = map.get(n);
            map.put(n, i + 1);
        }

        return map.entrySet().stream()
                .sorted((a, b) -> b.getValue() - a.getValue()) // Сортируем записи по убыванию количества встреч
                .limit(k) // Ограничиваем поток только первыми k элементами
                .mapToInt(Map.Entry::getKey) // Преобразуем записи в массив целых чисел
                .toArray();
    }
}
