/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        if (root != null) {
            queue.add(root);
        }
        List<List<Integer>> valuesList = new LinkedList<>();

        // breath-first-search (BST)
        while (!queue.isEmpty()) {
            int len = queue.size();
            List<Integer> values = new LinkedList<>();
            for (int i = 0; i < len; i++) {
                Node node = queue.poll();
                values.add(node.val);
                // enqueue the child nodes
                queue.addAll(node.children);
            }
            valuesList.add(values);
        }
        return valuesList;
    }
}
