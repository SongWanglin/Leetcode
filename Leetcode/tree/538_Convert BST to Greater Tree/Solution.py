# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def convertBST(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        curMax = [0];
        self.dfs(root, curMax);
        return root;
    def dfs(self, root, curMax):
        if not root: return None
        self.dfs(root.right, curMax)
        root.val+=curMax[0]
        curMax[0]=root.val
        self.dfs(root.left, curMax)

