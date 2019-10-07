class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        return max(map(lambda x: len(x), ''.join([str(num) for num in nums]).split('0')))
