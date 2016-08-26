package com.leetcode.easy;

/*
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path 
 * from the root node down to the farthest leaf node.
 * Solution idea gotten by "Finding maximum depth of a tree"
 * http://stackoverflow.com/questions/15271072/finding-maximum-depth-of-a-tree
 * 
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */

public class MaxDepth {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(0);
		root.left = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(5);
		System.out.println(getDepth(root));
	}
	
	static int getDepth(TreeNode n) {
		int depth;
		if(n == null) {
			depth = 0;
		} else if(n.left == null && n.right == null) {
			depth = 1;
		} else if (n.left == null) {
			depth = getDepth(n.right) + 1;
		} else if (n.right == null) {
			depth = getDepth(n.left) + 1;
		} else {
			depth = Math.max(getDepth(n.left), getDepth(n.right)) + 1;
		}
		return depth;
	}

}
