package kz.baltabayev.leetcode.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class IPO {

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        ArrayList<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < profits.length; i++) {
            pairs.add(new Pair(capital[i], profits[i]));
        }
        pairs.sort(Comparator.comparingInt(a -> a.capital));

        PriorityQueue<Pair> projects = new PriorityQueue<>();

        int i = 0;
        while (k > 0) {
            while (i < pairs.size() && pairs.get(i).capital <= w) {
                projects.add(pairs.get(i));
                i++;
            }

            if (projects.isEmpty()) break;
            Pair profitableProject = projects.poll();
            w += profitableProject.profit;
            k--;
        }

        return w;
    }

    public static class Pair implements Comparable<Pair> {
        private final int capital;
        private final int profit;

        public Pair(int capital, int profit) {
            this.capital = capital;
            this.profit = profit;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(o.profit, this.profit);
        }
    }
}
