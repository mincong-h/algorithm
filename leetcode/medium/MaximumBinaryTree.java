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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return newMaxBT(nums, 0, nums.length);
    }

    private TreeNode newMaxBT(int[] nums,
            int leftInclusive, int rightExclusive) {
        // limit: out of boundary
        if (leftInclusive >= rightExclusive || leftInclusive >= nums.length) {
            return null;
        }
        // find max position
        int maxPos = leftInclusive;
        for (int i = leftInclusive + 1; i < rightExclusive; i++) {
            if (nums[i] > nums[maxPos]) {
                maxPos = i;
            }
        }
        // construct binary tree
        TreeNode treeNode = new TreeNode(nums[maxPos]);
        treeNode.left = newMaxBT(nums, leftInclusive, maxPos);
        treeNode.right = newMaxBT(nums, maxPos + 1, rightExclusive);
        return treeNode;
    }
}
