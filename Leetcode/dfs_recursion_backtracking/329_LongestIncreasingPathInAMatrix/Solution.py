class Solution(object):
    def longestIncreasingPath(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: int
        """
        if not matrix or not matrix[0]: return 0
        distance = [[0 for j in range(len(matrix[0]))] for i in range(len(matrix))]
        res = [-sys.maxsize]
        def dfs(i, j):
            if distance[i][j]==0:
                distance[i][j] = 1+max(
                    dfs(i-1, j) if i and matrix[i][j]>matrix[i-1][j] else 0,
                    dfs(i+1, j) if i+1<len(matrix) and matrix[i][j]>matrix[i+1][j] else 0,
                    dfs(i, j-1) if j and matrix[i][j]>matrix[i][j-1] else 0,
                    dfs(i, j+1) if j+1<len(matrix[i]) and matrix[i][j]>matrix[i][j+1] else 0)
            res[0] = max(res[0], distance[i][j])
            return distance[i][j]
        for i in range(len(matrix)):
            for j in range(len(matrix[i])):
                dfs(i, j)
        return res[0]
