package kz.baltabayev.leetcode;

import java.util.Arrays;

public class MinimumNumberOfOperationsToMoveAllBalls {

    public static void main(String[] args) {
        MinimumNumberOfOperationsToMoveAllBalls moveAllBalls = new MinimumNumberOfOperationsToMoveAllBalls();
        int[] operations = moveAllBalls.minOperations("110");
        System.out.println(Arrays.toString(operations));
    }

    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];

        char[] boxesArray = boxes.toCharArray();
        for (int i = 0; i < boxesArray.length; i++) {
            int opCount = 0;
            for (int j = 0; j < boxesArray.length; j++) {
                if (i == j) {
                    continue;
                }

                if (boxesArray[j] == '1') {
                    // Вычесляем кол-во операций для перемещения этого шара в коробку i
                    opCount += Math.abs(i - j);
                }
            }
            answer[i] = opCount;
        }

        return answer;
    }
}
