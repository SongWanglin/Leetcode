# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def findFrequentTreeSum(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        if not root: return []
        dic = collections.defaultdict(int)
        res = []
        def dfs(root, dic):
            if not root: return 0
            root.val += dfs(root.left, dic)+dfs(root.right, dic)
            dic[root.val] += 1
            return root.val
        dfs(root, dic)
        freq = max(dic.values())
        return [key for key in dic if dic[key]==freq]
