package kz.baltabayev.leetcode.leetcode_75.binary_tree.dfs;

import kz.baltabayev.leetcode.utils.TreeNode;

public class LongestZigZagPathInABinaryTree {

    private int longestPath = 0;

    public int longestZigZag(TreeNode root) {
        if (root == null) return 0;

        countPathsFromNode(root.left, true, 1);
        countPathsFromNode(root.right, false, 1);

        return longestPath;
    }

    private void countPathsFromNode(TreeNode node, boolean isLeft, int count) {
        if (node == null) return;

        longestPath = Math.max(longestPath, count);

        if (isLeft) {
            countPathsFromNode(node.right, false, count + 1);
            countPathsFromNode(node.left, true, 1);
        } else {
            countPathsFromNode(node.left, true, count + 1);
            countPathsFromNode(node.right, false, 1);
        }
    }
}
