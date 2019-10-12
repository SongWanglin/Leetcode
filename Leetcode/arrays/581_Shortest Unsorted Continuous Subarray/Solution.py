class Solution(object):
    def findUnsortedSubarray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        origin = list(nums)
        list.sort(nums)
        res = [origin[i]-nums[i] for i in range(len(nums))]
        start, end = 0, len(res)-1
        while start <= end and res[start]==0: start+=1
        while end>=0 and res[end]==0: end -= 1
        return end-start+1 if end-start>=0 else 0
