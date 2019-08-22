# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isCousins(self, root, x, y):
        """
        :type root: TreeNode
        :type x: int
        :type y: int
        :rtype: bool
        """
        dx, px = self.dfs(root, None, 0, x)
        dy, py = self.dfs(root, None, 0, y)
        return dx == dy and px != py

    def dfs(self, node, parent, depth, val):
        if not node:
            return None
        if node.val == val:
            return depth, parent
        left =  self.dfs(node.left, node, depth+1, val)
        if left: return left
        right = self.dfs(node.right, node, depth+1, val)
        if right: return right
        return None
