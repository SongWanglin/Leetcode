class Solution(object):
    def minSubArrayLen(self, s, nums):
        """
        :type s: int
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return 0
        res, start, end, total = sys.maxsize, 0, -1, 0
        while start < len(nums):
            if total < s and end < len(nums)-1:
                end += 1
                total += nums[end]
            else:
                total -= nums[start]
                start += 1
            if total >= s:
                res = min(res, end-start+1)
        return 0 if res == sys.maxsize else res
