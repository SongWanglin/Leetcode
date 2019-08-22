# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def sumNumbers(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        return self.dfs(root, 0)

    def dfs(self, root, sum):
        if not root: return 0
        if not root.left and not root.right: return root.val+sum*10
        return self.dfs(root.left, root.val+10*sum) + self.dfs(root.right, root.val+10*sum)
