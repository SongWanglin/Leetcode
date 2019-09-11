class Solution(object):
    def lengthOfLIS(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums: return 0
        dp = [1]*len(nums)
        res = 1
        for i in range(1, len(nums)):
            for j in range(i+1):
                if nums[i]>nums[j]:
                    dp[i] = max(dp[i], dp[j]+1)
            res = max(res, dp[i])
        return res
