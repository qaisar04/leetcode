package kz.baltabayev.leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public static void main(String[] args) {
        KidsWithTheGreatestNumberOfCandies kidsWithTheGreatestNumberOfCandies = new KidsWithTheGreatestNumberOfCandies();
        int[] candies = new int[] {2, 3, 5, 1, 3};
        List<Boolean> results = kidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, 3);
        System.out.printf("results: %s", results); // [true,true,true,false,true]
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> results = new ArrayList<>();

        int maxCandiesCount = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxCandiesCount) {
                maxCandiesCount = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
           if (candies[i] + extraCandies >= maxCandiesCount) {
               results.add(true);
           } else {
               results.add(false);
           }
        }

        return results;
    }
}
