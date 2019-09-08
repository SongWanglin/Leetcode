class Solution(object):
    def maximumSum(self, arr):
        """
        :type arr: List[int]
        :rtype: int
        """
        n = len(arr)
        fw, bw = [0]*n, [0]*n
        curMax, maxSoFar = arr[0], arr[0]
        fw[0] = arr[0]
        for i in xrange(1, n):
            curMax = max(arr[i], curMax+arr[i])
            maxSoFar = max(maxSoFar, curMax)
            fw[i] = curMax
        curMax, maxSoFar, bw[-1] = arr[-1], arr[-1], arr[-1]
        for i in xrange(n-2, -1, -1):
            curMax = max(arr[i], curMax+arr[i])
            maxSoFar = max(maxSoFar, curMax)
            bw[i] = curMax
        res = maxSoFar
        for i in xrange(1, n-1):
            res = max(res, fw[i-1]+bw[i+1])
        return res
