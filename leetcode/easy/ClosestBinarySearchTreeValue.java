/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {

    public int closestValue(TreeNode root, double target) {
        int a = root.val;

        // choose a child to compare with value `a`
        TreeNode child = target < a ? root.left : root.right;
        if (child == null) {
            return a;
        }
        int b = closestValue(child, target);
        return Math.abs(target - a) < Math.abs(target - b) ? a : b;
    }
}
