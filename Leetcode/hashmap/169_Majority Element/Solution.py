class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count, major = 1, nums[0]
        for num in nums:
            if num == major:
                count+=1
            else:
                count-=1
            if count == 0:
                major = num
                count = 1
        return major
