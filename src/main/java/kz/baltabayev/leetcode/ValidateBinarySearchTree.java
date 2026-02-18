package kz.baltabayev.leetcode;

import java.util.Stack;
import kz.baltabayev.leetcode.utils.TreeNode;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, Long.MIN_VALUE, Long.MAX_VALUE));

        while (!stack.isEmpty()) {
            Pair popped = stack.pop();
            TreeNode node = popped.node;
            if (node == null) continue;

            if (node.val <= popped.minR || node.val >= popped.maxR) {
                return false;
            }

            stack.push(new Pair(node.left, popped.minR, node.val));
            stack.push(new Pair(node.right, node.val, popped.maxR));
        }
        return true;
    }

    public record Pair(TreeNode node, long minR, long maxR) {
    }
}
