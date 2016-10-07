// https://www.hackerrank.com/challenges/tree-inorder-traversal
void inOrder(Node root) {
    StringBuilder sb = new StringBuilder();
    DFS(root, sb);
    System.out.println(sb.toString().trim());
}

private void DFS(Node root, StringBuilder sb) {
    if (root == null) return;
    DFS(root.left, sb);
    sb.append(root.data + " ");
    DFS(root.right, sb);
}
