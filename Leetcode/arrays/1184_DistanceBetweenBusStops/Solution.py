class Solution(object):
    def distanceBetweenBusStops(self, distance, start, destination):
        """
        :type distance: List[int]
        :type start: int
        :type destination: int
        :rtype: int
        """
        if start > destination:
            temp = destination
            destination = start
            start = temp
        res1 = sum(distance[start:destination]);
        res2 = sum(distance[:start])+sum(distance[destination:])
        return min(res1, res2)
