# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def pathSum(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: List[List[int]]
        """
        if not root:
            return []
        res = []
        self.dfs(root, sum, [], res)
        return res

    def dfs(self, root, sum, path, res):
        if not root.left and not root.right and sum == root.val:
            path.append(root.val)
            res.append(path)
        if root.left:
            self.dfs(root.left, sum-root.val, path+[root.val], res)
        if root.right:
            self.dfs(root.right, sum-root.val, path+[root.val], res)
