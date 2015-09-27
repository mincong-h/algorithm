package com.leetcode.easy;

/*
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as a 
 * binary tree in which the depth of the two subtrees of every node 
 * never differ by more than 1.
 * 
 * https://leetcode.com/problems/balanced-binary-tree/
 */
public class BalancedBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(0);
		root.left = new TreeNode(1);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.left.left = new TreeNode(7);
		if(isBalanced(root)) {
			System.out.println("is balanced");
		} else {
			System.out.println("is not balanced");
		}

	}
	
	static boolean isBalanced(TreeNode root) {
		// we'll resolve this problem by recursive
		// if the root contains 2 subtrees, than we want to know whether they are
		// balanced. Else, we try to get the depth of the non null tree. if it is
		// deeper than 1, return false. If there isn't any subtree, return false
		
		// /!\ WRONG ALGORITHM
		if(root == null) {
			return true;
		} else {
			if(root.left == null && root.right == null) {
				return true;
			} else if(root.left == null) {
				return (root.right.left == null && root.right.right == null) ? true : false;
			} else if(root.right == null) {
				return (root.left.left == null && root.left.right == null) ? true : false;
			} else {
				return isBalanced(root.left) && isBalanced(root.right);
			}
		}
    }

}
