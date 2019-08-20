# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def partition(self, head, x):
        """
        :type head: ListNode
        :type x: int
        :rtype: ListNode
        """
        dummy1 = ListNode(-1)
        dummy2 = ListNode(-1)
        smallTail = dummy1
        greatTail = dummy2
        while head:
            if head.val < x:
                smallTail.next = head
                smallTail = smallTail.next
            else:
                greatTail.next = head
                greatTail = greatTail.next
            head = head.next
        greatTail.next = None
        smallTail.next = dummy2.next
        return dummy1.next;
