package kz.baltabayev.leetcode;

import kz.baltabayev.leetcode.utils.TreeNode;

public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        return sumLeftLeaves(root, false);
    }

    private int sumLeftLeaves(TreeNode node, boolean isLeft) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            return isLeft ? node.val : 0;
        }

        return sumLeftLeaves(node.left, true) + sumLeftLeaves(node.right, false);
    }
}
