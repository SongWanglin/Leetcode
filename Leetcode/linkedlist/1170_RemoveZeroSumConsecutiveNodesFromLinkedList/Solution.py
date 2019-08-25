# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def removeZeroSumSublists(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        cur = dummy = ListNode(0)
        dummy.next = head
        prefix = 0
        m = {}
        while cur:
            prefix += cur.val
            m.setdefault(prefix, cur).next = cur = cur.next
        return dummy.next
