class Solution(object):
    def canMakePaliQueries(self, s, queries):
        """
        :type s: str
        :type queries: List[List[int]]
        :rtype: List[bool]
        """
        dp = [[0]*26]
        a = ord('a')
        res = []
        for i in range(1, len(s)+1):
            new = dp[i-1][:]
            j = ord(s[i-1])-a
            new[j] += 1
            dp.append(new)
        for l, r, k in queries:
            L = dp[l]
            R = dp[r+1]
            res.append( sum((R[i]-L[i])&1 for i in range(26))//2<=k)
        return res
