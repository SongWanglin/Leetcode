class Solution(object):
    def findTargetSumWays(self, nums, S):
        """
        :type nums: List[int]
        :type S: int
        :rtype: int
        """
        total = sum(nums)
        if(abs(S)>total): return 0
        dp = [ [0]* (2*total+1) for _ in range(len(nums)+1) ]
        dp[0][total] = 1
        for i in range(len(nums)):
            for j in range(2*total+1):
                if dp[i][j]:
                    dp[i+1][j-nums[i]] += dp[i][j]
                    dp[i+1][j+nums[i]] += dp[i][j]
        #for row in dp:
        #    print row
        return dp[len(nums)][S+total]
