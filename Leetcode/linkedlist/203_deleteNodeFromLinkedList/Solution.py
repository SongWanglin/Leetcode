# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def removeElements(self, head, val):
        """
        :type head: ListNode
        :type val: int
        :rtype: ListNode
        """
        dummyHead = ListNode(-1)
        temp = dummyHead
        dummyHead.next = head
        while temp and temp.next:
            while temp.next and temp.next.val==val:
                temp.next = temp.next.next
            temp = temp.next
        return dummyHead.next
