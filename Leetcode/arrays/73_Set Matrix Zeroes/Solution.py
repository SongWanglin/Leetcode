class Solution(object):
    def setZeroes(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        m, n, firstRowHasZero= len(matrix), len(matrix[0]), not all(matrix[0])
        for i in xrange(1, m):
            for j in xrange(n):
                if matrix[i][j]==0:
                    matrix[0][j] = matrix[i][0] = 0
        for i in xrange(1, m):
            for j in xrange(n-1, -1, -1):
                if matrix[i][0]==0 or matrix[0][j]==0:
                    matrix[i][j] = 0
        if firstRowHasZero:
            matrix[0] = [0]*n
