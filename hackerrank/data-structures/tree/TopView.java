// https://www.hackerrank.com/challenges/tree-top-view
void top_view(Node root) {
    StringBuilder sb = new StringBuilder();
    if (root == null) {
        System.out.println();
        return;
    }
    leftDFS(root.left, sb);
    sb.append(root.data + " ");
    rightDFS(root.right, sb);
    System.out.println(sb.toString().trim());
}

void rightDFS(Node root, StringBuilder sb) {
    if (root == null) return;
    sb.append(root.data + " ");
    rightDFS(root.right, sb);
}

void leftDFS(Node root, StringBuilder sb) {
    if (root == null) return;
    leftDFS(root.left, sb);
    sb.append(root.data + " ");
}
