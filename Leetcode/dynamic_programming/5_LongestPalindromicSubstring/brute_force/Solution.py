class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        maxLen = 0
        res = ""
        for i in range(len(s)):
            for j in range(i, len(s)+1):
                temp = s[i:j]
                if temp==temp[::-1] and j-i>maxLen:
                    maxLen = j-i
                    res = temp
        return res
