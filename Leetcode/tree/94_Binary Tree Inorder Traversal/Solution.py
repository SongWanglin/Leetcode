# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def inorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        res = []
        self.dfs(res, root)
        return res

    def dfs(self, res, root):
        if not root: return None
        self.dfs(res, root.left)
        res.append(root.val)
        self.dfs(res, root.right)
