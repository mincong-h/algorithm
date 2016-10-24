/**
 * Written in Google Doc.
 *
 * Node is defined as :
 * class Node {
 *   int data;
 *   Node left;
 *   Node right;
 * }   
 */
static Node insert(Node root, int value) {
  if (root == null) {
    Node node = new Node();
    node.data = value;
    return node;
  }
  if (value < root.data) {
    if (root.left == null) {
      Node node = new Node();
      node.data = value;
      root.left = node;
    } else {
      root.left = insert(root.left, value);
    }
    return root;
  }
  if (value > root.data) {
    if (root.right == null) {
      Node node = new Node();
      node.data = value;
      root.right = node;
    } else {
      root.right = insert(root.right, value);
    }
    return root;
  }
  return root;
}
