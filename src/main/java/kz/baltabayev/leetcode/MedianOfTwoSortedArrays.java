package kz.baltabayev.leetcode;

public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int median;

        // Вычисялем индекс медианы
        if (totalLength % 2 == 0) {
            median = totalLength / 2;
        } else {
            median = (totalLength - 1) / 2;
        }

        int searched;
        if (nums1.length > nums2.length) {
            searched = search(nums1, median);
        } else {
            searched = search(nums2, median);
        }
        return (double) searched;
    }

    // Метод, который выполняет поиск элемента по индексу (target) используя бинарный поиск
    public int search(int[] nums1, int target) {
        int left = 0;
        int right = nums1.length - 1;

        while (left <= right) {
            int middle = right - (right - left) / 2;
            int middleValue = nums1[middle];

            if (middle == target) {
                return middleValue;
            }

            if (middle > target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }
}
