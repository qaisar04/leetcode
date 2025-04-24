package kz.baltabayev.leetcode.leetcode_75.binary_tree.dfs;

import java.util.ArrayList;
import java.util.List;
import kz.baltabayev.leetcode.utils.TreeNode;

public class LeafSimilarTrees {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();

        dfs(root1, leaves1);
        dfs(root2, leaves2);

        return leaves1.equals(leaves2);
    }

    private void dfs(TreeNode root, List<Integer> leaves) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            leaves.add(root.val);
        }

        dfs(root.left, leaves);
        dfs(root.right, leaves);
    }
}
