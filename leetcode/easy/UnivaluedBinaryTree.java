/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        return isUnival(root, root.val);
    }

    private boolean isUnival(TreeNode root, int val) {
        if (root == null) {
            return true;
        }
        return root.val == val
            && isUnival(root.left, val)
            && isUnival(root.right, val);
    }
}
