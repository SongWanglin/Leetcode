class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        #dp = [ prices[i]-prices[i-1] for i in range(1, len(prices))]
        maxSoFar, maxEndingHere = 0, 0
        for i in range(1, len(prices)):
            maxEndingHere = max(maxEndingHere+prices[i]-prices[i-1], prices[i]-prices[i-1])
            maxSoFar = max(maxSoFar, maxEndingHere)
        return maxSoFar
