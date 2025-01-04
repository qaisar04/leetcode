package kz.baltabayev.leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        ProductOfArrayExceptSelf product = new ProductOfArrayExceptSelf();
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(product.productExceptSelf(nums))); // [24, 12, 8, 6]
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Шаг 1: Заполняем префиксы
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Шаг 2: Учитываем суффиксы
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i]; // Обновляем суффикс
        }

        return answer;
    }
}
