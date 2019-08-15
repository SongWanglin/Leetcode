# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def reverseBetween(self, head, m, n):
        """
        :type head: ListNode
        :type m: int
        :type n: int
        :rtype: ListNode
        """
        dummy = ListNode(-1)
        dummy.next = head
        cur, pre, nxt = dummy, dummy, dummy
        for i in xrange(n+1):
            next = cur.next
            if i==m: head = prev
            if i>=m: cur.next = prev
            prev = cur
            cur = next
        head.next.next = cur
        head.next = prev
        return dummy.next
