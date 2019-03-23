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
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (d == 1) {
            TreeNode node = new TreeNode(v);
            node.left = root;
            return node;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 1;
        while (!queue.isEmpty()) {
            int n = queue.size();
            if (level + 1 == d) {
                // add new nodes
                while (n > 0) {
                    TreeNode node = queue.poll();
                    // left
                    TreeNode leftGrandChild = node.left;
                    TreeNode leftChild = new TreeNode(v);
                    node.left = leftChild;
                    leftChild.left = leftGrandChild;
                    // right
                    TreeNode rightGrandChild = node.right;
                    TreeNode rightChild = new TreeNode(v);
                    node.right = rightChild;
                    rightChild.right = rightGrandChild;
                    n--;
                }
            } else {
                while (n > 0) {
                    TreeNode node = queue.poll();
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                    n--;
                }
            }
            level++;
        }
        return root;
    }
}
