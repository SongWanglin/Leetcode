class Solution:
    def trap(self, height: List[int]) -> int:
        dp1 = [max(height[:i]) for i in range(1, len(height))]
        dp2 = [max(height[i:]) for i in range(0, len(height)-1)]
        dp = [min(dp1[i], dp2[i+1]) for i in range(0, len(dp2)-1)]
        res = 0
        for i in range(1, len(height)-1):
            if height[i] < dp[i-1]:
                res += dp[i-1]-height[i]
        return res
