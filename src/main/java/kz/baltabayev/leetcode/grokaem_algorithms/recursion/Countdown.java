package kz.baltabayev.leetcode.grokaem_algorithms.recursion;

public class Countdown {

    private static void countdown(int i) {
        System.out.print(i + " ");

        // base case
        if (i <= 0) {
            return;
        } else {
            countdown(i - 1);
        }
    }

    public static void main(String[] args) {
        countdown(5); // 5 4 3 2 1 0
    }
}
