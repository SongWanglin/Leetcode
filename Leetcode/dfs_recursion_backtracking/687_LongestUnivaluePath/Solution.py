# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def longestUnivaluePath(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        res = [0]
        self.dfs(root, None, res)
        return res[0]

    def dfs(self, current, parent, res):
        if current is None: return 0
        left = self.dfs(current.left, current, res)
        right = self.dfs(current.right, current, res)
        res[0] = max(res[0], left+right)
        return max(left, right)+1 if parent and parent.val==current.val else 0
