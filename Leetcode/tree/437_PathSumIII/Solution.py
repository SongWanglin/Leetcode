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
        :rtype: int
        """
        if root is None:
            return 0
        return  self.count(root, sum) + self.pathSum(root.left, sum) + self.pathSum(root.right, sum)

    def count(self, root, sum):
        if root is None:
            return 0
        c = 1 if root.val==sum else 0
        return c + self.count(root.left, sum-root.val) + self.count(root.right, sum-root.val)
