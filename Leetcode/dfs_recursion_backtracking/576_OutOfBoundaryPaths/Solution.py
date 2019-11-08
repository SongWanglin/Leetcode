class Solution(object):
    def findPaths(self, m, n, N, i, j):
        """
        :type m: int
        :type n: int
        :type N: int
        :type i: int
        :type j: int
        :rtype: int
        """
        dp = [[[-1 for k in range(N+1)] for y_index in range(n)] for x_index in range(m)]
        M = 10**9+7
        def dfs(x, y, step):
            if not (0<=x<m and 0<=y<n):
                return 1
            if step==0:
                return 0
            if dp[x][y][step]!=-1:
                return dp[x][y][step]
            dp[x][y][step] = ((dfs(x-1, y, step-1)+dfs(x+1, y, step-1))%M + (dfs(x, y-1, step-1)+dfs(x, y+1, step-1))%M)%M
            return dp[x][y][step]
        res = dfs(i, j, N)
        return res
