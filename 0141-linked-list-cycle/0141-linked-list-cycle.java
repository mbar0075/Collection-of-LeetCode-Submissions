/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // Floyd's Tortoise and Hare algorithm
        if (head == null || head.next == null) {
            return false;
        }
        
        ListNode slow = head; // The slow pointer moves one step at a time
        ListNode fast = head.next; // The fast pointer moves two steps at a time
        
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false; // If fast pointer reaches the end, there is no cycle
            }
            
            slow = slow.next; // Move slow pointer one step
            fast = fast.next.next; // Move fast pointer two steps
        }
        
        return true; // If fast and slow pointers meet, there is a cycle
    }
}
