package kz.baltabayev.leetcode.bfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import kz.baltabayev.leetcode.utils.TreeNode;

public class FindLargestValueInEachTreeRow {

    public List<Integer> largestValues(TreeNode root) {
        if (root == null) return Collections.emptyList();

        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int maxValue = Integer.MIN_VALUE;

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();

                if (node.right != null) {
                    queue.add(node.right);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }

                maxValue = Math.max(maxValue, node.val);
            }
            result.add(maxValue);
        }

        return result;
    }
}
