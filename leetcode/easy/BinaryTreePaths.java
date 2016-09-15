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
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        if (root.left == null && root.right == null) {
            return Arrays.asList(String.valueOf(root.val));
        }

        List<String> leftPaths = binaryTreePaths(root.left);
        List<String> rightPaths = binaryTreePaths(root.right);
        List<String> rootPaths = new ArrayList<>(leftPaths.size() + rightPaths.size());

        for (String path : leftPaths) {
            rootPaths.add(root.val + "->" + path);
        }
        for (String path : rightPaths) {
            rootPaths.add(root.val + "->" + path);
        }
        return rootPaths;
    }
}
