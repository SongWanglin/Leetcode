# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def kthSmallest(self, root, k):
        """
        :type root: TreeNode
        :type k: int
        :rtype: int
        """
        if root is None:
            return 0
        leftCount = self.nodeCount(root.left)
        if k <= leftCount:
            return self.kthSmallest(root.left, k)
        if k > leftCount+1:
            return self.kthSmallest(root.right, k-leftCount-1)
        return root.val

    def nodeCount(self, root):
        if root is None:
            return 0
        return 1+self.nodeCount(root.left)+self.nodeCount(root.right)
