/**
 * Written in Google Doc.
 *
 * class Node {
 *   int data;
 *   Node left;
 *   Node right;
 * }
 */
boolean checkBST(Node root) {
  return checkBST(root, null, null);
}


private boolean checkBST(Node root, Integer min, Integer max) {
  if (root == null) {
    return true;
  }
  if (max != null && root.data >= max) {
    return false;
  }
  if (min != null && root.data <= min) {
    return false;
  }
  return checkBST(root.left, min, root.data)
      && checkBST(root.right, root.data, max);
}

