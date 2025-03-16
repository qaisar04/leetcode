package kz.baltabayev.leetcode;

public class CanPlaceFlowers {

    public static void main(String[] args) {
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        boolean flowers = canPlaceFlowers.canPlaceFlowers(new int[] {0, 0, 1, 0, 0}, 1);
        System.out.printf("flowers: %s", flowers);
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;

        for (int i = 0; i < len && n > 0; i++) {
            if (flowerbed[i] == 1) {
                continue;
            }

            int prev = (i == 0) ? 0 : flowerbed[i - 1];
            int next = (i == len - 1) ? 0 : flowerbed[i + 1];

            if (prev == 0 && next == 0) {
                flowerbed[i] = 1;
                n--;
            }

        }

        return n <= 0;
    }
}
