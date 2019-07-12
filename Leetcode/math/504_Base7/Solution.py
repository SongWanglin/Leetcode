class Solution(object):
    def convertToBase7(self, num):
        """
        :type num: int
        :rtype: str
        """
        if not num: return '0'
        l, n = [], num < 0
        if n: num *= -1
        while num:
            l.append(str(num % 7))
            num //= 7
        if n: l.append('-')
        return ''.join(l[::-1])
