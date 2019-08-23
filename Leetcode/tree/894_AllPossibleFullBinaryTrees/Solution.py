# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def allPossibleFBT(self, N):
        """
        :type N: int
        :rtype: List[TreeNode]
        """
        res = []
        if N==1:
            res.append(TreeNode(0))
            return res
        N-=1
        for i in xrange(1, N, 2):
            left = self.allPossibleFBT(i)
            right = self.allPossibleFBT(N-i)
            for l in left:
                for r in right:
                    cur = TreeNode(0)
                    cur.left = l
                    cur.right = r
                    res.append(cur)
        return res
