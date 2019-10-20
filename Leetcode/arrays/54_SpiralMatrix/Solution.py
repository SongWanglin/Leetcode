class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        res = []
        while matrix:
            res += matrix.pop(0)
            if any(matrix):
                for row in matrix:
                    res.append(row.pop())
            if matrix:
                res += matrix.pop()[::-1]
            if any(matrix):
                res += [row[0] for row in matrix][::-1]
                for row in matrix:
                    row.pop(0)
        return res
