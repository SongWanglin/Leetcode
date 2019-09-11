class Solution(object):
    def numIslands(self, grid):
        """
        :type grid: List[List[str]]
        :rtype: int
        """
        res = 0
        if not grid: return res
        def dfs(i, j):
            if not(0<=i<len(grid) and 0<=j<len(grid[i]) and grid[i][j]=='1'):
                return
            grid[i][j] = '0'
            dfs(i+1, j); dfs(i-1, j); dfs(i, j+1); dfs(i, j-1);
        for i in range(len(grid)):
            for j in range(len(grid[i])):
                if grid[i][j]=='0':
                    continue
                dfs(i, j)
                res += 1
        return res
