# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def maxPathSum(self, root: TreeNode) -> int:
        res = [-sys.maxsize]
        self.dfs(root, res)
        return res[0]

    def dfs(self, root, res):
        if not root:
            return 0
        left = self.dfs(root.left, res)
        right = self.dfs(root.right, res)
        returnVal = max(root.val, max(root.val+left, root.val+right))
        res[0] = max(res[0], max(returnVal, left+root.val+right))
        return returnVal
