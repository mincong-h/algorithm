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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> results = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            // level
            int n = queue.size();
            List<Integer> result = new ArrayList<>(n);
            while (n > 0) {
                TreeNode node = queue.poll();
                result.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                n--;
            }
            results.add(result);
        }
        return results;
    }
}
