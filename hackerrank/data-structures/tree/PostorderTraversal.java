// https://www.hackerrank.com/challenges/tree-postorder-traversal
void postOrder(Node root) {
    StringBuilder sb = new StringBuilder();
    DFS(root, sb);
    System.out.println(sb.toString().trim());
}

private void DFS(Node root, StringBuilder sb) {
    if (root == null) return;
    DFS(root.left, sb);
    DFS(root.right, sb);
    sb.append(root.data + " ");
}
