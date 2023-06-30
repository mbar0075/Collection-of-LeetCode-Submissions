# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        prevPtr = None
        currentPtr = head
        
        while currentPtr:
            nextNode = currentPtr.next  # Save the next node
            currentPtr.next = prevPtr       # Reverse the link
            prevPtr = currentPtr            # Move the pointers forward
            currentPtr = nextNode
        
        return prevPtr
        