# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def maxAncestorDiff(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if not root:
            return 0
        res = self.dfs(root)
        return res[0]

    def dfs(self, root):
        if not root:
            return [0, sys.maxint, 0]
        if not root.left and not root.right:
            return [0, root.val, root.val]
        left = self.dfs(root.left)
        right = self.dfs(root.right)
        res = [0, sys.maxint, 0]
        lower = min(left[1], right[1])
        higher = max(left[2], right[2])
        res[1] = min(root.val, lower)
        res[2] = max(root.val, higher)
        res[0] = max( max(left[0], right[0]), max(abs(root.val-lower), abs(root.val-higher)) )
        return res
