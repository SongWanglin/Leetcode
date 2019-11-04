class Solution(object):
    def numberOfSubarrays(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        dq = collections.deque([-1])
        res = 0
        for i, num in enumerate(nums):
            if num%2==1:
                dq.append(i)
            if len(dq) > k+1:
                dq.popleft()
            if len(dq) == k+1:
                res += (1+dq[1])-(1+dq[0])
        return res
