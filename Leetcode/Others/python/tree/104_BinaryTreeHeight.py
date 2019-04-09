class Solution:
    def maxDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        return 0 if root is None else max(self.maxDepth(root.left),self.maxDepth(root.right))+1;