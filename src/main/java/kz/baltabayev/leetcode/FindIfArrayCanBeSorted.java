package kz.baltabayev.leetcode;

public class FindIfArrayCanBeSorted {

    public static void main(String[] args) {
        FindIfArrayCanBeSorted canBeSorted = new FindIfArrayCanBeSorted();
        int[] nums = {136, 256, 10};
        boolean result = canBeSorted.canSortArray(nums);
        System.out.println(result);
    }

    public boolean canSortArray(int[] nums) {
        int bitCount = Integer.bitCount(nums[0]);
        int prevMax = -1;
        int curMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (Integer.bitCount(nums[i]) != bitCount) {
                bitCount = Integer.bitCount(nums[i]);
                prevMax = Math.max(curMax, prevMax);
                curMax = nums[i];
            } else {
                curMax = Math.max(curMax, nums[i]);
            }
            if (prevMax != -1 && nums[i] < prevMax) {
                return false;
            }
        }
        return true;
    }

//    public boolean canSortArray(int[] nums) {
//        int[] sortedNums = Arrays.copyOf(nums, nums.length);
//        Arrays.sort(sortedNums);
//
//        Map<Integer, List<Integer>> groupedByBitCount = Arrays.stream(nums)
//                .boxed()
//                .collect(Collectors.groupingBy(
//                        Integer::bitCount,
//                        LinkedHashMap::new,
//                        Collectors.toList()
//                ));
//
//        groupedByBitCount.forEach((key, list) -> Collections.sort(list));
//
//        List<Integer> mergedList = groupedByBitCount.values().stream()
//                .flatMap(List::stream)
//                .toList();
//
//        for (int i = 0; i < nums.length; i++) {
//            if (mergedList.get(i) != sortedNums[i]) {
//                return false;
//            }
//        }
//        return true;
//    }
}
