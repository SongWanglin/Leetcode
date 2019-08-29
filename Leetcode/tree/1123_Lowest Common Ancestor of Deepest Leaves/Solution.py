# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def lcaDeepestLeaves(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        self.lca, self.deepest = None, 0
        def helper(node, depth):
            self.deepest = max(self.deepest, depth)
            if not node:
                return depth
            left = helper(node.left, depth + 1)
            right = helper(node.right, depth + 1)
            if left == right == self.deepest:
                self.lca = node
            return max(left, right)
        helper(root, 0)
        return self.lca
