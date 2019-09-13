class Solution(object):
    def sortArrayByParity(self, nums):
        """
        :type A: List[int]
        :rtype: List[int]
        """
        firstOdd = 0
        while firstOdd < len(nums) and nums[firstOdd]%2==0 :
            firstOdd += 1
        tracker = firstOdd+1
        while tracker < len(nums):
            if nums[tracker]%2==0:
                nums[firstOdd], nums[tracker] = nums[tracker], nums[firstOdd]
                firstOdd += 1
            tracker += 1
        return nums
