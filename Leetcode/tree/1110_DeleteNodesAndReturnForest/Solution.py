# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def delNodes(self, root, to_delete):
        """
        :type root: TreeNode
        :type to_delete: List[int]
        :rtype: List[TreeNode]
        """

        to_delete_set = set(to_delete)
        res = []
        def dfs(root, is_root):
            if not root: return None
            deleted = root.val in to_delete_set
            if is_root and not deleted:
                res.append(root)
            root.left = dfs(root.left, deleted)
            root.right = dfs(root.right, deleted)
            return None if deleted else root
        dfs(root, True)
        return res
