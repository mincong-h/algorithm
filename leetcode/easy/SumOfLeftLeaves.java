public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (isLeave(root.left)) {
            return sumOfLeftLeaves(root.right) + root.left.val;
        } else {
            return sumOfLeftLeaves(root.right) + sumOfLeftLeaves(root.left);
        }
    }

    private boolean isLeave(TreeNode root) {
        return root != null && root.left == null && root.right == null;
    }
}
