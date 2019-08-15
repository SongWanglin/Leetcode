# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    """
    def merge(self, h1, h2):
        dummy = tail = ListNode(None)
        while h1 and h2:
            if h1.val < h2.val:
                tail.next, tail, h1 = h1, h1, h1.next
            else:
                tail.next, tail, h2 = h2, h2, h2.next

        tail.next = h1 or h2
        return dummy.next
    """
    def sortList(self, head):
        """
        if not head or not head.next:
            return head

        pre, slow, fast = None, head, head
        while fast and fast.next:
            pre, slow, fast = slow, slow.next, fast.next.next
        pre.next = None

        return self.merge(*map(self.sortList, (head, slow)))
        """
        """
        :type head: ListNode
        :rtype: ListNode
        """

        if not head or not head.next:
            return head
        if not head.next.next:
            if head.val > head.next.val:
                res = head.next
                head.next.next = head
                head.next = None
                return res
            else:
                return head
        slow, fast = head, head.next
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
        fast = slow.next
        slow.next = None
        head = self.sortList(head)
        slow = self.sortList(fast)
        dummy = ListNode(-1)
        temp = dummy
        while head and slow:
            if head.val > slow.val:
                temp.next = slow
                slow = slow.next
                temp = temp.next
            else:
                temp.next = head
                head = head.next
                temp = temp.next
        if head: temp.next = head
        if slow: temp.next = slow
        return dummy.next

