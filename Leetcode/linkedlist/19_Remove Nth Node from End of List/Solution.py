# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        N = [n]
        head = self.recursiveFindAndRemove(head, N)
        return head

    def recursiveFindAndRemove(self, head, N):
        if not head: return head
        head.next = self.recursiveFindAndRemove(head.next, N)
        N[0]-=1
        return head.next if N[0]==0 else head
