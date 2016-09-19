public class Solution {
    public int longestConsecutive(TreeNode root) {
        return (root == null) ? 0 : Math.max(dfs(root.left, 1, root.val), dfs(root.right, 1, root.val));
    }

    /**
     * Depth First Search
     */
    public int dfs(TreeNode root, int count, int val){
        if (root == null) return count;
        count = (root.val - val == 1) ? count + 1 : 1;
        int left = dfs(root.left, count, root.val);
        int right = dfs(root.right, count, root.val);
        return Math.max(Math.max(left, right), count);
    }
}
