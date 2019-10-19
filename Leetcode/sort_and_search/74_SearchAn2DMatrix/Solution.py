class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if not matrix or len(matrix[0])==0:
            return False
        mid = matrix[0][len(matrix[0])-1]
        if mid > target:
            for row in matrix:
                row.pop()
            return self.searchMatrix(matrix, target)
        return True if mid==target else self.searchMatrix(matrix[1:], target)
