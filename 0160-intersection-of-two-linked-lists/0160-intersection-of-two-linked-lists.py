# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def getIntersectionNode(self, headA, headB):
        """
        :type head1, head1: ListNode
        :rtype: ListNode
        """
        # Declaring two pointers
        ptrA = headA
        ptrB = headB
        
        # Looping while ptrA is not ptrB
        while ptrA != ptrB:
            # Updating pointer, if pointer reaches the end, then setting it to head of subsequent list
            ptrA = ptrA.next if ptrA else headB
            ptrB = ptrB.next if ptrB else headA

        return ptrA