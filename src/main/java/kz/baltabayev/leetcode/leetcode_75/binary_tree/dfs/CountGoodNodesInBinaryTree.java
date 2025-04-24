package kz.baltabayev.leetcode.leetcode_75.binary_tree.dfs;

import kz.baltabayev.leetcode.utils.TreeNode;

public class CountGoodNodesInBinaryTree {

    int goodNodesCount = 1;

    public int goodNodes(TreeNode root) {
        if (root == null) return 0;

        dfs(root, root.val);
        return goodNodesCount;
    }

    private int dfs(TreeNode node, int max) {
        if (node == null) return 0;

        if (node.val >= max) {
            goodNodesCount++;
        }

        dfs(node.left, Math.max(node.val, max));
        dfs(node.right, Math.max(node.val, max));

        return goodNodesCount;
    }
}
