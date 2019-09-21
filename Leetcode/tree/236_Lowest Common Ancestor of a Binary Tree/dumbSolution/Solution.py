# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def lowestCommonAncestor(self, root, p, q):
        """
        :type root: TreeNode
        :type p: TreeNode
        :type q: TreeNode
        :rtype: TreeNode
        """
        res = root
        dic = {}
        dic2 = {}
        def dfs(node, p, q):
            if not node:
                return False
            if node.val==p.val or node.val==q.val:
                dic[node.val] = True
                dic2[node.val] = True
                return True
            left = dfs(node.left, p, q)
            right = dfs(node.right, p, q)
            dic[node.val] = (left and right)
            dic2[node.val] = (left or right)
            return left or right
        dfs(root, p, q)
        while res:
            if dic[res.val]:
                break
            else:
                if not res.right or not res.right.val in dic or not dic2[res.right.val]:
                    res = res.left
                else:
                    res = res.right
        return res
