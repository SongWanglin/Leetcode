class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        res, left, right = -sys.maxsize, 0, len(height)-1
        while left<right:
            h = min(height[left], height[right])
            res = max(res, (right-left)*h)
            while height[left]<=h and left<right:
                left+=1
            while height[right]<=h and left <right:
                right-=1
        return res
