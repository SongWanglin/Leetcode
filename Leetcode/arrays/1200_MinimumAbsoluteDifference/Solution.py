class Solution(object):
    def minimumAbsDifference(self, arr):
        """
        :type arr: List[int]
        :rtype: List[List[int]]
        """
        list.sort(arr)
        min_dif = sys.maxsize
        for i in range(1, len(arr)):
            min_dif = min(min_dif, arr[i]-arr[i-1])
        res = []
        for i in range(1, len(arr)):
            if(arr[i]-arr[i-1]==min_dif):
                res.append([arr[i-1], arr[i]])
        return res
