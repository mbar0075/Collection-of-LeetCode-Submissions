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
    public ListNode deleteDuplicates(ListNode head) {
        // Base Cases
        if (head == null || head.next == null)
            return head;
        
        // Declaring Variables
        ListNode output = new ListNode(0);
        output.next = head;
        ListNode prev = head;
        ListNode ptr = head.next;
        
        // Looping until pointer is not null
        while (ptr != null) {
            if (ptr.val == prev.val) {
                prev.next = ptr.next; // Skipping the duplicate node
            } else {
                prev = ptr; // Moving the pointer for unique nodes
            }
            ptr = ptr.next; // Moving to the next node
        }

        return output.next;
    }
}
