class Solution(object):
    def maxAreaOfIsland(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        def dfs(sr, sc):
            if (not (0 <= sr <len(grid) and 0 <= sc <len(grid[sr]))):
                return 0
            if grid[sr][sc]==0:
                return 0
            grid[sr][sc] = 0
            return 1+sum([dfs(sr + x, sc + y) for (x, y) in ((0, 1), (1, 0), (0, -1), (-1, 0))])
        res = 0
        for i in xrange(0, len(grid)):
            for j in xrange(0, len(grid[i])):
                res = max(dfs(i, j), res)
        return res
