package kz.baltabayev.leetcode;

import java.util.HashSet;
import java.util.List;

public class ReverseVowelsOfAString {

    public static void main(String[] args) {
        ReverseVowelsOfAString reverseVowelsOfAString = new ReverseVowelsOfAString();
        String reversed = reverseVowelsOfAString.reverseVowels("IceCreAm");
        System.out.println(reversed);
    }

    public String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<>(List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        int left = 0, right = s.length() - 1;

        char[] array = s.toCharArray();
        while (left < right) {
            if (!vowels.contains(array[left])) {
                left++;
                continue;
            }

            if (!vowels.contains(array[right])) {
                right--;
                continue;
            }

            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }

        return String.valueOf(array);
    }
}
