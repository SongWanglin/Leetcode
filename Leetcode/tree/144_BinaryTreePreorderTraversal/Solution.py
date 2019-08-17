# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def preorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        ret = []
        stack = [root]
        while stack:
            node = stack.pop()
            if node:
                ret.append(node.val)
                stack.append(node.right)
                stack.append(node.left)
        return ret
    """
        res = []
        self.dfs(res, root)
        return res

    def dfs(self, res, root):
        if not root: return None
        res.append(root.val)
        self.dfs(res, root.left)
        self.dfs(res, root.right)
    """

