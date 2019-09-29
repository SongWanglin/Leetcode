class Solution(object):
    def uniqueOccurrences(self, arr):
        """
        :type arr: List[int]
        :rtype: bool
        """
        res = list(collections.Counter(arr).values())
        list.sort(res)
        for i in range(len(res)-1):
            if(res[i]==res[i+1]):
                return False
        return True
