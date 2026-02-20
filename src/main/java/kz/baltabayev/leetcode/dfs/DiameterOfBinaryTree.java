package kz.baltabayev.leetcode.dfs;

import kz.baltabayev.leetcode.utils.TreeNode;

public class DiameterOfBinaryTree {

    private int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return diameter;
    }

    public int dfs(TreeNode node) {
        if (node == null) return 0;

        int l = dfs(node.left);
        int r = dfs(node.right);

        diameter = Math.max(diameter, l + r);

        return Math.max(l, r) + 1;
    }
}
