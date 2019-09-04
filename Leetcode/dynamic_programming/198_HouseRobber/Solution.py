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
        dp = [0]*2
        dp[0] =nums[-1]
        for i in xrange(n-2, -1, -1):
            tmp = dp[0]
            dp[0] = max(nums[i]+dp[1], dp[0])
            dp[1] = tmp
        return dp[0]
