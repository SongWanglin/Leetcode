class Solution(object):
    def isPerfectSquare(self, num):
        """
        :type num: int
        :rtype: bool
        """
        if num==1: return True
        start, end = 0, num//2
        while start <= end:
            mid = (start+end)//2
            if mid**2==num:
                return True
            if mid**2 > num:
                end = mid - 1
            else:
                start = mid + 1
        return False
