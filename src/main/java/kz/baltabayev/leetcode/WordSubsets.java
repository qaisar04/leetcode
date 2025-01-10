package kz.baltabayev.leetcode;

import java.util.ArrayList;
import java.util.List;

public class WordSubsets {

    public List<String> wordSubsets(String[] words1, String[] words2) {
        // Массив для хранения максимальных частот символов для всех слов в words2
        int[] maxFreq = new int[26];

        // Определяем максимальные частоты символов для каждого слова в words2
        for (String word : words2) {
            int[] freq = getFrequency(word);
            for (int i = 0; i < 26; i++) {
                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
            }
        }

        List<String> result = new ArrayList<>();

        // Проверяем каждое слово в words1
        for (String word : words1) {
            int[] freq = getFrequency(word);
            if (isSubset(freq, maxFreq)) {
                result.add(word);
            }
        }

        return result;
    }

    // Подсчитывает частоты символов в слове
    private static int[] getFrequency(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }

    // Проверяет, является ли maxFreq подмножеством freq
    private static boolean isSubset(int[] freq, int[] maxFreq) {
        for (int i = 0; i < 26; i++) {
            if (freq[i] < maxFreq[i]) {
                return false;
            }
        }
        return true;
    }
}
