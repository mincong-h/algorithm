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
    public List<Integer> postorder(Node root) {
        List<Integer> results = new ArrayList<>();
        if (root == null) {
            return results;
        }
        // left, right, root
        for (Node child : root.children) {
            results.addAll(postorder(child));
        }
        results.add(root.val);
        return results;
    }
}
