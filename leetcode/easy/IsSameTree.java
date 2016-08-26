package com.leetcode.easy;

/*
 * Given two binary trees, write a function to check if they are equal 
 * or not. Two binary trees are considered equal if they are structurally 
 * identical and the nodes have the same value.
 *
 * https://leetcode.com/problems/same-tree/
 */
public class IsSameTree {

	public static void main(String[] args) {
		// tree a
		TreeNode a = new TreeNode(0);
		a.left = new TreeNode(1);
		a.right = new TreeNode(2);
		// tree b
		TreeNode b = new TreeNode(0);
		b.left = new TreeNode(1);
		b.right = new TreeNode(2);
		if(isSameTree(a, b))
			System.out.println("a b is the same tree");
		else
			System.out.println("a b is not the same tree");
	}
	
	static boolean isSameTree(TreeNode a, TreeNode b) {
		boolean result;
		// if a & b are not null, than we can compare their value
		// and do a recursive check to know whether their children
		// trees are the same
		if (a != null && b != null && a.val == b.val) {
			result = isSameTree(a.left, b.left) && isSameTree(a.right, b.right);
		// if a and b are null, it means they're leaves. They are the
		// same trees. End the comparison. 
		} else if(a == null && b == null) {
			result = true;
		// any other cases mean that they're different
		} else {
			result = false;
		}
		return result;
	}
}
