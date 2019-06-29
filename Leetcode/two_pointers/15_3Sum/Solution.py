class Solution:
    def threeSum(self, nums):
        res = []
        nums.sort()

        for i in range(len(nums)-1):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            if nums[i] > 0:
                break
            d = {}
            j = i + 1
            while j < len(nums):
                req = -nums[i] - nums[j]
                if req in d:
                    res.append([nums[i], req, nums[j]])
                    while j < len(nums)-1 and nums[j] == nums[j+1]:
                        j = j + 1
                else:
                    d[nums[j]] = j
                j += 1
        return res
