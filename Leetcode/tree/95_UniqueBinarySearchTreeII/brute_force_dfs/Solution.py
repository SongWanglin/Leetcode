# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def generateTrees(self, n):
        """
        :type n: int
        :rtype: List[TreeNode]
        """
        if n==0: return []
        xs = [TreeNode(i) for i in range(1, n+1)]
        return self.dfs(xs)

    def dfs(self, xs):
        if not xs:
            return [None]
        res = []
        for i in range(len(xs)):
            temp = xs[i]
            leftChilds = self.dfs(xs[:i])
            rightChilds = self.dfs(xs[i+1:])
            for left in leftChilds:
                temp.left = left
                for right in rightChilds:
                    temp.right = right
                    res += [copy.deepcopy(temp)]
        return res
