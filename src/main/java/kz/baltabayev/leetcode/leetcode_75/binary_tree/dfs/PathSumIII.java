package kz.baltabayev.leetcode.leetcode_75.binary_tree.dfs;

import kz.baltabayev.leetcode.utils.TreeNode;

public class PathSumIII {

    public static void main(String[] args) {
        //       10
        //      /  \
        //     5   -3
        //    / \     \
        //   3   2     11
        //  / \   \
        // 3  -2   1

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.right.right = new TreeNode(11);

        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);
        root.left.right.right = new TreeNode(1);

        int targetSum = 8;

        PathSumIII solution = new PathSumIII();
        int result = solution.pathSum(root, targetSum);

        System.out.println("Total paths with sum " + targetSum + ": " + result);
    }

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;

        int count = countPathsFromNode(root, targetSum);

        count += pathSum(root.left, targetSum);
        count += pathSum(root.right, targetSum);

        return count;
    }

    private int countPathsFromNode(TreeNode node, long targetSum) {
        if (node == null) return 0;

        System.out.println("Visiting Node: " + node.val + ", TargetSum: " + targetSum);

        int count = 0;

        if (node.val == targetSum) {
            System.out.println("Found path ending at Node: " + node.val);
            count++;
        }

        count += countPathsFromNode(node.left, targetSum - node.val);
        count += countPathsFromNode(node.right, targetSum - node.val);

        return count;
    }
}
