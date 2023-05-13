class Solution:
    def removeNodes(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head:
            return None
    
        tail = self.removeNodes(head.next)
        
        if not tail or tail.val <= head.val:
            head.next = tail
            return head
        else:
            return tail