class Solution(object):
    def arrangeCoins(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n == 1:
            return 1
        left = 1
        right = n
        while(left < right):
            mid = left + (right - left) /2
            total = (mid*(mid+1))/2
            if total == n:
                return mid
            if total < n:
                left = mid+1
            else:
                right = mid
        return left-1
