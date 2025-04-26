package kz.baltabayev.leetcode.leetcode_75.binary_search_tree;

import kz.baltabayev.leetcode.utils.TreeNode;

public class SearchInABinarySearchTree {

    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (root.val == val) {
                return root;
            } else if (root.val > val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }

        return null;
    }
}
