class Solution(object):
    def findSubsequences(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        result = [[]]
        for num in nums:
            result += [acc + [num] for acc in result
                                   if not acc or acc[-1] <= num]
        return {str(seq):seq for seq in result if len(seq) > 1}.values()
