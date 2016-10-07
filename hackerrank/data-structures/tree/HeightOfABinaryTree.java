// https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree
int height(Node root) {
    return (root == null) ? -1 : Math.max(height(root.left), height(root.right)) + 1;
}
