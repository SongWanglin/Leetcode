class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        begin = 0
        end = len(nums) - 1
        mid = (begin + end)//2
        while begin <= end:
            if nums[mid] < target:
                begin = mid + 1
                mid = (begin + end)//2
            else:
                if nums[mid] == target:
                    return mid
                end = mid - 1
                mid = (begin + end)//2
        return -1
