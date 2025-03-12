package kz.baltabayev.leetcode;

public class MergeStringsAlternately {

    public static void main(String[] args) {
        MergeStringsAlternately alternately = new MergeStringsAlternately();
        String result = alternately.mergeAlternately("abc", "pqr");
        System.out.printf("result: %s", result); // result: apbqcr
    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder builder = new StringBuilder();

        char[] array_1 = word1.toCharArray();
        char[] array_2 = word2.toCharArray();

        int max = Math.max(array_1.length, array_2.length);

        int k = 0;
        int m = 0;

        for (int i = 0; i < max; i++) {
            if (k < array_1.length) {
                builder.append(array_1[k]);
                k++;
            }
            if (m < array_2.length) {
                builder.append(array_2[m]);
                m++;
            }
        }

        return builder.toString();
    }
}
