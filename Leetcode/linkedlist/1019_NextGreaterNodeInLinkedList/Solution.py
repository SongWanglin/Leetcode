# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def nextLargerNodes(self, head):
        """
        :type head: ListNode
        :rtype: List[int]
        """
        stk = []
        nums = []
        temp = head
        while temp:
            nums.append(temp.val)
            temp = temp.next
        res = [0]*len(nums)
        for i in range(len(nums)):
            while stk and nums[stk[-1]]<nums[i]:
                res[stk.pop()] = nums[i]
            stk.append(i)
        return res
