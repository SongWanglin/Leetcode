class Solution:
    def minCut(self, s: str) -> int:
        n = len(s)
        #res = ""
        dp = [[False for _ in range(n)] for _ in range(n)]
        minCuts = [0]*n
        for i in range(n-1, -1, -1):
            minCuts[i] = sys.maxsize
            for j in range(i, n):
                dp[i][j] = (s[i]==s[j]) and (j-i<3 or dp[i+1][j-1])
                if dp[i][j]:
                    #res = s[i:j+1]
                    if j==n-1: minCuts[i] = 0
                    else:
                        minCuts[i] = min(minCuts[i], minCuts[j+1]+1)
        return minCuts[0]
