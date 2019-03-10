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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        LinkedList<List<Integer>> results = new LinkedList<>();
        // Breath-First-Search
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int remaining = queue.size();
            List<Integer> result = new ArrayList<>(remaining);
            while (remaining > 0) {
                TreeNode node = queue.poll();
                result.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                remaining--;
            }
            results.addFirst(result);
        }
        return results;
    }
}
