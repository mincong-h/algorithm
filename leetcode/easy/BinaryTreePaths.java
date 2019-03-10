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
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        if (root.left == null && root.right == null) {
            return Collections.singletonList("" + root.val);
        }
        List<String> leftPaths = binaryTreePaths(root.left);
        List<String> rightPaths = binaryTreePaths(root.right);
        List<String> paths = new ArrayList<>(leftPaths.size() + rightPaths.size());
        for (String p : leftPaths) {
            paths.add(root.val + "->" + p);
        }
        for (String p : rightPaths) {
            paths.add(root.val + "->" + p);
        }
        return paths;
    }
}
