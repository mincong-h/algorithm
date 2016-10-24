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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> results = new LinkedList<>();
        DFS(results, root);
        return results;
    }

    /**
     * In-order: Left child tree -> root -> right child tree
     */
    private void DFS(List<Integer> results, TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            DFS(results, root.left);
        }
        results.add(root.val);
        if (root.right != null) {
            DFS(results, root.right);
        }
    }
}

