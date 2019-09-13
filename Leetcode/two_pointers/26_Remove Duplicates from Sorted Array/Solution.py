class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        lastNonDup = 0
        for i in xrange(1, len(nums)):
            if nums[i]==nums[lastNonDup]:
                continue;
            lastNonDup+=1
            nums[lastNonDup] = nums[i]
        return lastNonDup+1
