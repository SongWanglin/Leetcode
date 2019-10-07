class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        start, end = 0, x
        while start <= end:
            mid = (start+end)//2
            if mid**2 <= x < (mid+1)**2:
                return mid
            if mid**2 > x:
                end = mid-1
            else:
                start = mid+1
        return -1
