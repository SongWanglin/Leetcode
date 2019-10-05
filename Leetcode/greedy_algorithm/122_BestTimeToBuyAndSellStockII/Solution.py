class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        dp = [prices[i]-prices[i-1] for i in range(1, len(prices))]
        return sum(list(filter( (lambda x: x>0), dp)))
