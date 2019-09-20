class Solution:
    def find132pattern(self, nums: List[int]) -> bool:
        for i in range(0, len(nums)-2):
            a_i = nums[i]
            for j in range(i+1, len(nums)-1):
                a_j = nums[j]
                last = list(filter(lambda x: x>a_i and x<a_j, nums[j+1:]))
                if last == []:
                    continue
                return True
        return False
