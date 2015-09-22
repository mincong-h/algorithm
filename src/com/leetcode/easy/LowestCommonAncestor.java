package com.leetcode.easy;

/*
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given 
 * nodes in the BST. According to the definition of LCA on Wikipedia: “The lowest common 
 * ancestor is defined between two nodes v and w as the lowest node in T that has both v 
 * and w as descendants (where we allow a node to be a descendant of itself).”
 * 
 *         _______6______
 *        /              \
 *    ___2__          ___8__
 *   /      \        /      \
 *   0      _4       7       9
 *         /  \
 *         3   5
 *         
 * For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is 
 * LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the 
 * LCA definition.
 * 
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 */

public class LowestCommonAncestor {

	public static void main(String[] args) {
		TreeNode a = new TreeNode(6);
		a.left = new TreeNode(2);
		a.right = new TreeNode(8);
		a.left.left = new TreeNode(0);
		a.left.right = new TreeNode(4);
		a.right.left = new TreeNode(7);
		a.right.right = new TreeNode(9);
		a.left.right.left = new TreeNode(3);
		a.left.right.right = new TreeNode(5);
		// get lowest common ancestor
		TreeNode result0 = lowestCommonAncestor0(a, a.left.left, a.left.right.left);
		TreeNode result = lowestCommonAncestor(a, a.left.left, a.left.right.left);
		System.out.printf("case 0: (p, q) sorted, with p.val <= q.val. lca=%d\n", result0.val);
		System.out.printf("case 1: (p, q) random. lca=%d", result.val);

	}
	
	// this method assume that p.val <= q.val
	static TreeNode lowestCommonAncestor0(TreeNode root, TreeNode p, TreeNode q) {
		TreeNode lca = root;
		if(root != null) {
			// if left side of the root contains value, which is greater
			// than q's value, that means we're out side of search range
			// on the right. Continue on the left to approach the value.
			if(root.val > q.val) {
				lca = lowestCommonAncestor0(root.left, p, q);

			// if right side of the root contains value, which is fewer
			// than p's value, that means we're out side of search range
			// on the left. Continue on the right to approach the value.
			} else if(root.val < p.val) {
				lca = lowestCommonAncestor0(root.right, p, q);
				
			// if root's value equals p's or q's value, or if root's 
			// value is located between p and q, it means that root is
			// already the lowest common ancestor of this solution.
			} else {
				lca = root;
			}
		}
		return lca;
	}
	
	// this method assume that p.val and q.val are random values
	static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		TreeNode lca = root;
		if(root != null) {
			if(p.val <= q.val) {
				if(root.val > q.val) {
					lca = lowestCommonAncestor(root.left, p, q);
				} else if(root.val < p.val) {
					lca = lowestCommonAncestor(root.right, p, q);
				} else {
					lca = root;
				}
			} else {
				if(root.val > p.val) {
					lca = lowestCommonAncestor(root.left, p, q);
				} else if(root.val < q.val) {
					lca = lowestCommonAncestor(root.right, p, q);
				} else {
					lca = root;
				}
			}
		}
		return lca;
	}
}
