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
    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) return Collections.emptyList();

        List<List<Integer>> done = new LinkedList<>();
        Queue<TreeNode> todo = new LinkedList<>();
        todo.add(root);

        while (todo.size() > 0) {
            List<Integer> levelDone = new ArrayList<>();
            for (int i = todo.size(); i > 0; i--) {
                TreeNode node = todo.poll();
                levelDone.add(node.val);
                // enqueue to child nodes
                if (node.left != null) todo.add(node.left);
                if (node.right != null) todo.add(node.right);
            }
            done.add(levelDone);
        }
        return done;
    }
}
