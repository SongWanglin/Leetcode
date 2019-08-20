# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def sumRootToLeaf(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        res = [0]
        self.dfs(root, 0, res)
        return res[0]

    def dfs(self, root, val, res):
        if root is None: return None
        val = val*2 + root.val
        self.dfs(root.left, val, res)
        self.dfs(root.right, val, res)
        if not root.left and not root.right:
            res[0]+=val
            return None
