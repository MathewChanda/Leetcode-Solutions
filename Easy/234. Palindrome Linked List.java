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


/**

What I need to improve on 
    - Traversing a linked liost 
    - Remembering linked list points to reference, not values 
    - Two pointers

What I struggle 
    - Finding the middle of the linked list with two pointers
    - Not realizing we need to two pointers

What I learned 
    - When the fast pointer is twice the speed of the slow pointer, fast pointer will reach the end of the linked list when slow node at the half way point. 
**/ 
class Solution {
    public boolean isPalindrome(ListNode head) {
        // Start at the beginning 
        ListNode slow = head; 
        ListNode fast = head; 
        
        // The fast pointer is twice the speed of the slow pointer, fast pointer will reach the end of the linked list when slow node at the half way point. 
        while(fast != null && fast.next != null){
            slow = slow.next; 
            fast = fast.next.next; 
        }
        
        
        // Flip the remaining half of the nodes that slow pointer yet to reach
        slow = reversed(slow); 
        
        // Restart the fast node at the beginning of the linked list 
        fast = head; 
        
        
        // checks each node if they are the same
        while(slow != null){
            // condition when the nodes are not the same values 
            if(slow.val != fast.val){
                return false; 
            }
            
            // moving the nodes ahead 
            slow = slow.next; 
            fast = fast.next; 
        }
        
        
        return true;
    }
    
    
    public ListNode reversed(ListNode head){
        ListNode prev = null; 
        while(head != null){
            ListNode next = head.next; 
            head.next = prev; 
            prev = head; 
            head = next; 
        }
        
        return prev; 
    }
}
