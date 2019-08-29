class Solution(object):
    def distributeCandies(self, candies):
        """
        :type candies: List[int]
        :rtype: int
        """
        types = list(set(candies))
        return min(len(candies)/2, len(types))
