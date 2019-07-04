class Solution(object):
    def countSubstrings(self, s):
        """
        :type s: str
        :rtype: int
        """
        res = 0
        dp = [[0 for _ in range(len(s))] for _ in range(len(s))]
        for i in range(len(s)-1,-1,-1):
            for j in range(i, len(s)):
                dp[i][j] = s[i]==s[j] and ((j - i < 2) or dp[i+1][j-1])
                if dp[i][j]:
                    res += 1
        return res
