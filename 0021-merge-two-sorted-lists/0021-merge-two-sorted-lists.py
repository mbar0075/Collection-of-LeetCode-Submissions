# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeTwoLists(self, list1, list2):
        output = ListNode()
        head = output
        pointer1=list1
        pointer2=list2
        while(pointer1 is not None and pointer2 is not None):
            if(pointer1.val<pointer2.val):
                output.next = pointer1
                pointer1 = pointer1.next
            else:
                output.next = pointer2
                pointer2 = pointer2.next
            output=output.next

        if pointer1 is not None:
            output.next = pointer1

        if pointer2 is not None:
            output.next = pointer2
        return head.next