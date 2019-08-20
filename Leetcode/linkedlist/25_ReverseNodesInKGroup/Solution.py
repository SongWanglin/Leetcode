# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def reverseKGroup(self, head, k):
        """
        :type head: ListNode
        :type k: int
        :rtype: ListNode
        """
        if not head or not head.next: return head
        tail, nextHead = head, head
        i = 0
        while nextHead and i<k:
            tail = nextHead
            nextHead = nextHead.next
            i+=1
        if i<k: return head
        tail.next = None
        next, current, prev = None, head, None
        while current:
            next = current.next
            current.next = prev
            prev = current
            current = next
        head = prev
        tail = head
        while tail.next:
            tail = tail.next
        tail.next = self.reverseKGroup(nextHead, k)
        return head

