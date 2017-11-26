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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> averages = new ArrayList<>();
        Queue<TreeNode> todo = new LinkedList<>();
        todo.add(root);

        while (!todo.isEmpty()) {
            int size = todo.size();
            double sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = todo.poll();
                sum += node.val;
                // enqueue leaves
                if (node.left != null) {
                    todo.add(node.left);
                }
                if (node.right != null) {
                    todo.add(node.right);
                }
            }
            averages.add(sum / size);
        }
        return averages;
    }
}
