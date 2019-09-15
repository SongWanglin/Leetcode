class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        dic = {}
        stack = []
        for num in nums2:
            while stack and stack[-1] < num:
                key = stack.pop()
                dic[key] = num
            stack.append(num)
        res = []
        for num in nums1:
            val = dic[num] if num in dic else -1
            res.append(val)
        return res
