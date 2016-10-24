/**  
 * Written in Google Doc.
 *
 * class Node {
 *   int data;
 *   Node left;
 *   Node right;
 * }
 */
void LevelOrder(Node root) {

  if (root == null) {
    return;
  }

  StringBuilder sb = new StringBuilder();
  Queue<Node> queue = new LinkedList<>();
  queue.add(root);

  while (!queue.isEmpty()) {
    for (int counter = queue.size(); counter > 0; counter--) {
      Node node = queue.poll();
      sb.append(node.data).append(" ");
      if (node.left != null) {
        queue.add(node.left);
      }
      if (node.right != null) {
        queue.add(node.right);
      }
    }
  }
  System.out.println(sb.toString().trim());
}

