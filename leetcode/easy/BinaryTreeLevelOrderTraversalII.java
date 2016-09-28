public class Solution {

    /**
     * BFS: Breadth-First-Search
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        Queue<TreeNode> open = new LinkedList<>();
        List<List<Integer>> results = new LinkedList<>();
        if (root == null) return results;

        open.offer(root);
        while (!open.isEmpty()) {
            int level = open.size();
            List<Integer> close = new LinkedList<>();
            for (int i = 0; i < level; i++) {
                if (open.peek().left != null) open.offer(open.peek().left);
                if (open.peek().right != null) open.offer(open.peek().right);
                close.add(open.poll().val);
            }
            results.add(0, close);
        }
        return results;
    }
}
