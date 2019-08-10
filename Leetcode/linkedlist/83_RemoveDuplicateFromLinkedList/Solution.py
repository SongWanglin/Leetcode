# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head: return head
        temp = head;
        while temp:
            while temp.next and temp.val==temp.next.val:
                temp.next = temp.next.next
            temp = temp.next
        return head

