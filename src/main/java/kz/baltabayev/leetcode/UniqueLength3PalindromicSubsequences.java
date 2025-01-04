package kz.baltabayev.leetcode;

import java.util.HashSet;
import java.util.Set;

public class UniqueLength3PalindromicSubsequences {

    public static void main(String[] args) {
        UniqueLength3PalindromicSubsequences subsequences = new UniqueLength3PalindromicSubsequences();
        int i = subsequences.countPalindromicSubsequence("aabca");
        System.out.println(i);
    }

    public int countPalindromicSubsequence(String s) {
        Set<String> palindromes = new HashSet<>();

        // Для каждого уникального символа в строке
        for (char c = 'a'; c <= 'z'; c++) {
            int first = s.indexOf(c);
            int last = s.lastIndexOf(c);

            // Если символ встречается хотя бы дважды
            if (first != -1 && last != -1 && first < last) {
                // Собираем все уникальные символы между первым и последним вхождением
                for (int i = first + 1; i < last; i++) {
                    palindromes.add("" + c + s.charAt(i) + c);
                }
            }
        }

        return palindromes.size();
    }
}
