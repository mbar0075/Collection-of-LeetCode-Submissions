# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        # First pass to count the number of nodes in the list
        count = 0
        node = head
        while node is not None:
            count += 1
            node = node.next
        
        # Calculate the index of the node to remove from the beginning of the list
        index_to_remove = count - n
        
        # If the head node needs to be removed, return the second node as the new head
        if index_to_remove == 0:
            return head.next
        
        # Second pass to remove the nth node from the end of the list
        current_index = 0
        prev_node = None
        node = head
        while node is not None:
            if current_index == index_to_remove:
                prev_node.next = node.next
                break
            prev_node = node
            node = node.next
            current_index += 1
        
        return head