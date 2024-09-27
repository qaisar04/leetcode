package kz.baltabayev.leetcode;

public class CountTestedDevicesAfterTestOperations {

    // https://leetcode.com/problems/count-tested-devices-after-test-operations/
    public static void main(String[] args) {
        int[] batteryPercentages = {1, 1, 2, 1, 3};
        int i = countTestedDevices(batteryPercentages);
        System.out.println(i);
    }

    // todo: improve code
    public static int countTestedDevices(int[] batteryPercentages) {
        int countOfTestedDevices = 0;
        int n = batteryPercentages.length - 1;
        for (int i = 0; i <= n; i++) {
            if (batteryPercentages[i] > 0) {
                countOfTestedDevices++;
            } else if (batteryPercentages[i] == 0) {
                continue;
            }

            for (int j = i + 1; j <= n; j++) {
                batteryPercentages[j] = Math.max(0, batteryPercentages[j] - 1);
            }
        }

        return countOfTestedDevices;
    }
}
