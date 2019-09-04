class Solution(object):
    def rob(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        """
        #recursive solution
        if not nums:
            return 0
        return max(nums[0]+self.rob(nums[2:]), self.rob(nums[1:]))
        """
        if not nums:
            return 0
        n = len(nums)
        dp = [0]*(n+1)
        dp[n-1] =nums[-1]
        for i in xrange(n-2, -1, -1):
            dp[i] = max(nums[i]+dp[i+2], dp[i+1])
        return dp[0]
