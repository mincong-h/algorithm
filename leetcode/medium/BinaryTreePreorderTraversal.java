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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> results = new LinkedList<>();
        dfs(results, root);
        return results;
    }

    private void dfs(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        dfs(list, root.left);
        dfs(list, root.right);
    }
}
