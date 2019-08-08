# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def minDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if root is None:
            return 0
        if not root.left and not root.right:
            return 1
        if root.left is None:
            return 1+self.minDepth(root.right)
        if root.right is None:
            return 1+self.minDepth(root.left)
        return min(1+self.minDepth(root.left), 1+self.minDepth(root.right))
