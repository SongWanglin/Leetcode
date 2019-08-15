# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def findTilt(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        res = [0]
        self.dfs(root, res)
        return res[0]

    def dfs(self, root, res):
        if not root: return 0
        left = self.dfs(root.left, res)
        right = self.dfs(root.right, res)
        res[0] += abs(left-right)
        return root.val+left+right
