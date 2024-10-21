package kz.baltabayev.leetcode;

public class PowerOfTwo {

    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        boolean ofTwo = powerOfTwo.isPowerOfTwo(-2147483648);
    }

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        String binaryString = Integer.toBinaryString(n);
        int countOfOnes = 0;

        for (char bit : binaryString.toCharArray()) {
            if (bit == '1') {
                countOfOnes++;
            }
        }

        return countOfOnes == 1;
    }
}
