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
    public int pathSum(TreeNode root, int sum) {
        return pathSum(root, sum, new int[0]);
    }

    private int pathSum(TreeNode root, int sum, int[] parentCumsums) {
        if (root == null) {
            return 0;
        }
        int[] cumsums = new int[parentCumsums.length + 1];
        int count = 0;
        for (int i = 0; i < parentCumsums.length; i++) {
            int s = parentCumsums[i] + root.val;
            cumsums[i] = s;
            if (s == sum) {
                count++;
            }
        }
        cumsums[cumsums.length - 1] = root.val;
        if (root.val == sum) {
            count++;
        }
        return count
            + pathSum(root.left, sum, cumsums)
            + pathSum(root.right, sum, cumsums);
    }
}
