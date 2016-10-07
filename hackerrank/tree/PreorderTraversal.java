// https://www.hackerrank.com/challenges/tree-preorder-traversal

void preOrder(Node root) {
    StringBuilder sb = new StringBuilder();
    buildString(sb, root);
    System.out.println(sb.toString().trim());
}

private void buildString(StringBuilder sb, Node root) {
    if (root == null) return;
    sb.append(root.data + " ");
    buildString(sb, root.left);
    buildString(sb, root.right);
}
