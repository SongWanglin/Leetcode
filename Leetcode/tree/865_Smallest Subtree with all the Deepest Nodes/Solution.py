# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def subtreeWithAllDeepest(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        if not root:
            return None
        left, right = self.depth(root.left), self.depth(root.right)
        if left==right:
            return root
        return self.subtreeWithAllDeepest(root.left) if left>right else self.subtreeWithAllDeepest(root.right)

    def depth(self, root):
        if not root: return 0
        return 1+max(self.depth(root.left), self.depth(root.right))
