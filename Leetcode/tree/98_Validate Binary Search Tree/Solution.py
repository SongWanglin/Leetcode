# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isValidBST(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        return self.dfs(root, -sys.maxint-1, sys.maxint)

    def dfs(self, root, lowerBound, higherBound):
        if not root:
            return True
        res = root.val>lowerBound and root.val<higherBound
        return res and self.dfs(root.left, lowerBound, root.val) and self.dfs(root.right, root.val, higherBound)
