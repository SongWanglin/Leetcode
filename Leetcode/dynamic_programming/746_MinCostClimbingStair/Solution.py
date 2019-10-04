class Solution(object):
    def minCostClimbingStairs(self, cost):
        """
        :type cost: List[int]
        :rtype: int
        """
        n = len(cost)
        if n == 1: return cost[0]
        for i in range(2, n):
            cost[i] += min(cost[i-1], cost[i-2])
        return min(cost[-2], cost[-1])
