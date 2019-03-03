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
    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(t.val));
        // left
        if (t.left != null) {
            sb.append('(').append(tree2str(t.left)).append(')');
        } else if (t.right != null) {
            // left cannot be ommitted if right exists
            sb.append("()");
        }
        // right
        if (t.right != null) {
            sb.append('(').append(tree2str(t.right)).append(')');
        }
        return sb.toString();
    }
}
