# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def isPalindrome(self, head):
        num=""
        pointer=head.next
        num+=str(head.val)
        while pointer is not None:
            num+=str(pointer.val)
            pointer=pointer.next

        firstCount=0
        secondCount=len(num)-1
        while(firstCount<=secondCount):
            if(num[firstCount]!=num[secondCount]):
                return False
            firstCount+=1
            secondCount-=1

        return True