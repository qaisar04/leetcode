package kz.baltabayev.leetcode.leetcode_75.binary_tree.dfs;

import kz.baltabayev.leetcode.utils.TreeNode;

public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
