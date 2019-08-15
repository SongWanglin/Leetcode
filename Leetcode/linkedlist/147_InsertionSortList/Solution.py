# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def insertionSortList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        dummy = ListNode("-inf")
        temp = dummy
        curr = head
        next = head
        while curr:
            temp = dummy
            next = curr.next
            curr.next = None
            while temp.next and curr.val > temp.next.val:
                temp = temp.next
            curr.next = temp.next
            temp.next = curr
            curr = next
        return dummy.next
