package kz.baltabayev.leetcode;

public class Sqrt {

    public static void main(String[] args) {
        System.out.println(mySqrt(10));
    }

    // Time Limit Exceeded
    public static int mySqrt(int x) {
        if (x < 2) return x;

        int left = 0;
        int right = x;

        while (left <= right) {
            int mid = (left + right) / 2;
            int midSquared = mid * mid;

            if (midSquared == x) {
                return mid;  // Найден точный квадратный корень
            } else if (midSquared < x) {
                left = mid + 1;  // mid слишком маленький, увеличиваем левую границу
            } else {
                right = mid - 1;  // mid слишком большой, уменьшаем правую границу
            }
        }

        return right;
    }

    // Алгоритм метода mySqrt

    // Предположим что x = 10
    // init - left = 0 right = 10

    // 1 итерация:
    // mid = (0 + 10) / 2 = 5
    // midSquared = 25 | right = mid(5) - 1 = 4

    // 2 итерация:
    // mid = (0 + 4) / 2 = 2
    // midSquared = 4 | left = mid(2) + 1 = 3

    // 3 итерация:
    // mid = (3 + 4) / 2 = 3
    // midSquared = 9 | left = mid(3) + 1 = 4

    // 4 итерация:
    // mid = (4 + 4) / 2 = 4
    // midSquared = 16 | right = mid(4) - 1 = 3

    // 5 итерация:
    // left = 4 | right = 3 return right(3)
}
