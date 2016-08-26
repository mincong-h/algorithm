package com.leetcode.easy;

/*
 * Invert a binary tree.
 *
 *      4                   4
 *    /   \               /   \
 *   2     7      to     7     2
 *  / \   / \           / \   / \
 * 1   3 6   9         9   6 3   1
 * 
 * https://leetcode.com/problems/invert-binary-tree/
 */
public class InvertBinaryTree {

	public static void main(String[] args) {
		// tree
		TreeNode a = new TreeNode(4);
		a.left = new TreeNode(2);
		a.left.left = new TreeNode(1);
		a.left.right = new TreeNode(3);
		a.right = new TreeNode(7);
		a.right.left = new TreeNode(6);
		a.right.right = new TreeNode(9);
		// before
		System.out.println(a.val);
		System.out.println(a.left.val + " " + a.right.val);
		System.out.println(a.left.left.val + " " + a.left.right.val + " "
						+ a.right.left.val + " " + a.right.right.val);
		// invert
		TreeNode b = invertTree(a);
		// after
		System.out.println(b.val);
		System.out.println(b.left.val + " " + b.right.val);
		System.out.println(b.left.left.val + " " + b.left.right.val + " "
						+ b.right.left.val + " " + b.right.right.val);
	}
	
	static TreeNode invertTree(TreeNode root) {
		if(root != null) {
			// invert tree's children
			TreeNode invertRoot = new TreeNode(root.val);
			invertRoot.left = root.right;
			invertRoot.right = root.left;
			// recursive for tree's children
			invertRoot.left = invertTree(invertRoot.left);
			invertRoot.right = invertTree(invertRoot.right);
			return invertRoot;
		} else {
			return null;
		}
	}
}
