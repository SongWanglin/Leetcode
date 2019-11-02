class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        if numRows==0:
            return []
        res = [[1]]
        for i in range(1, numRows):
            last = res[-1]
            res += [[1]+[last[i]+last[i+1] for i in range(len(last)-1)]+[1]]
        return res
