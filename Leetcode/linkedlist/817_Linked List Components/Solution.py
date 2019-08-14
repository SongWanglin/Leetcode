# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def numComponents(self, head, G):
        """
        :type head: ListNode
        :type G: List[int]
        :rtype: int
        """
        s = set()
        for x in G:
            s.add(x)
        res = 0
        while head:
            if head.val in s and (not head.next or not head.next.val  in s):
                res+=1
            head = head.next
        return res;
