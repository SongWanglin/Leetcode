# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def isPalindrome(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        fast = slow = head
        # find the mid
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
        # reverse the second half
        preHead, nxt = None, None
        while slow:
            nxt = slow.next
            slow.next = preHead
            preHead = slow
            slow = nxt
        # compare the first and second half
        while preHead:
            if preHead.val!=head.val:
                return False
            preHead = preHead.next
            head = head.next
        return True
