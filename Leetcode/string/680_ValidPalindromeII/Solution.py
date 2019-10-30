class Solution(object):
    def validPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        start, end = 0, len(s)-1
        while start<end:
            if s[start]!=s[end]:
                slice1 = s[start:end]
                slice2 = s[start+1:end+1]
                return slice1==slice1[::-1] or slice2==slice2[::-1]
            start+=1; end-=1
        return True
