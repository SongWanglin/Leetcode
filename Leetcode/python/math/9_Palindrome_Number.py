class Solution:
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        res = str(x);
        return res == res[::-1] and x>=0;
        