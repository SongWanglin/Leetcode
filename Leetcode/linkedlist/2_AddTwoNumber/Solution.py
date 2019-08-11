# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        dummyHead = ListNode(-1)
        temp = dummyHead
        addOne, sum, val = 0, 0, 0
        while l1 or l2 or addOne:
            sum = (0 if not l1 else l1.val) + (0 if not l2 else l2.val) + addOne
            addOne = sum//10
            val = sum%10
            temp.next = ListNode(val)
            temp = temp.next
            l1 = l1 if not l1 else l1.next
            l2 = l2 if not l2 else l2.next
        return dummyHead.next
