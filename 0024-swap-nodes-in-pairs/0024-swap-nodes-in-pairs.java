/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null) {
        return head; // No need to swap if there are 0 or 1 nodes
    }
    
    ListNode output = new ListNode(0); // Dummy node to handle the edge case of swapping the head
    output.next = head;
    ListNode prev = output;
    
    while (head != null && head.next != null) {
        ListNode first = head;
        ListNode second = head.next;
        
        // Swapping the positions of first and second nodes
        prev.next = second;
        first.next = second.next;
        second.next = first;
        
        // Updating pointers for the next iteration
        prev = first;
        head = first.next;
    }
    
    return output.next; // Return the modified head node
}

}