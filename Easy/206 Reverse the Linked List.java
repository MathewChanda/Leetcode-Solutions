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
    public ListNode reverseList(ListNode head) {
        // Make a prev node 
        ListNode prev = null;
        // Moving the head node until the node is node  
        while(head != null){
            // Need to get reference of the next node
            ListNode nextNode = head.next; 
            // Point the previous node to the next node 
            head.next = prev; 
            // make the previous node as head 
            prev = head; 
            // keep moving the head forward
            head = nextNode; 
        }
        
        return prev; 
    }
}