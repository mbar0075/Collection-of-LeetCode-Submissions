# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeElements(self, head, val):
        dummy = ListNode(0)
        dummy.next = head
        previous = dummy
        pointer = head
        while pointer is not None:
            if pointer.val == val:
                previous.next = pointer.next
            else:
                previous = pointer
            pointer = pointer.next
        return dummy.next