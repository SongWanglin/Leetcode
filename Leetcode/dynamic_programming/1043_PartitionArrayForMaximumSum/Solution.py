class Solution:
    def maxSumAfterPartitioning(self, A: List[int], K: int) -> int:
        n=len(A)
        dp=[0]*(n+1)
        for i in range(1, n+1):
            curMax=float('-inf')
            for j in range(1, min(i,K)+1):
                curMax=max(curMax, A[i-j])
                dp[i]=max(dp[i], dp[i-j]+curMax*j)
        return dp[n]


