# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def flatten(self, root):
        """
        :type root: TreeNode
        :rtype: None Do not return anything, modify root in-place instead.
        """
        prev = [None]
        self.dfs(root, prev)

    def dfs(self, root, prev):
        if not root: return None
        left = root.left
        right = root.right
        self.dfs(right, prev)
        self.dfs(left, prev)
        root.right = prev[0]
        root.left = None
        prev[0] = root

