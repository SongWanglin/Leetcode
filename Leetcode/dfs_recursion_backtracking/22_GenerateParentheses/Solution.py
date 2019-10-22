class Solution(object):
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        def dfs(left, right, temp):
            if left > n or right > n:
                return
            if left==n and right==n:
                res.append(temp)
                return
            if left < n:
                dfs(left+1, right, temp+"(")
            if left > right:
                dfs(left, right+1, temp+")")
        res = []
        dfs(0, 0, "")
        return res
