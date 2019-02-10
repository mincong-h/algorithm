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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> results = new LinkedList<>();
        dfs(results, root);
        return results;
    }

    private void dfs(List<Integer> results, TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(results, root.left);
        results.add(root.val);
        dfs(results, root.right);
    }
}
