class Solution(object):
    def fib(self, N):
        """
        :type N: int
        :rtype: int
        """
        if N<=0: return 0
        dp = [0]*2
        dp[1] = 1
        for i in xrange(1, N):
            temp = dp[1]
            dp[1] += dp[0]
            dp[0] = temp
        return dp[1]
