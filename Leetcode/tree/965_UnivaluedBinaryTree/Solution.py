# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isUnivalTree(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if not root: return True
        left = True if not root.left else root.val==root.left.val
        right = True if not root.right else root.val==root.right.val
        return left and right and self.isUnivalTree(root.left) and self.isUnivalTree(root.right)
