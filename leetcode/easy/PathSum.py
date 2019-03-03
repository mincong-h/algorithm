# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def hasPathSum(self, root: TreeNode, sum: int) -> bool:
        if root:
            if root.left or root.right:
                return self.hasPathSum(root.left, sum - root.val) \
                    or self.hasPathSum(root.right, sum - root.val)
            else:
                return root.val == sum
        else:
            return False
