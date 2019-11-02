class Solution(object):
    def getRow(self, rowIndex):
        """
        :type rowIndex: int
        :rtype: List[int]
        """
        last, res = [], [1]
        for i in range(1, rowIndex+1):
            last = res
            res = [1]+[last[i]+last[i+1] for i in range(len(last)-1)]+[1]
        return res
