class Solution(object):
    def numSquares(self, n):
        """
        :type n: int
        :rtype: int
        """
        res = [sys.maxsize]
        def dfs(target, num, count):
            if target<0 or count>=res[0]:
                return
            if target==0:
                res[0] = min(res[0], count)
                return
            for i in range(num, -1, -1):
                square = i**2
                if square > target:
                    continue
                dfs(target-square, i, count+1)
        dfs(n, int(n**0.5), 0)
        return res[0]
