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

/*

What I need to improve on
    - Determining what nodes need to be iterate 
    
What I struggle with 
    - Which node that I need to start in my while loop 
*/ 

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // First, we need to make a dummy node because the first node can contain the unwanted value. 
        // We have a while loop that continues to iterate through the whole list until we hit a tail node or node where it's next         //  node is null
        // within the while loop, if we encounter the unwanted value as the next node, we must set the current node next node to
        // the node after the unwanted node 
        // Finally, we must get the following node after dummy node since we want to ignore the first node of the newly created n         //   node 
        
        // Make starter linked list 
        ListNode dummy = new ListNode(-1, head);
        
        // Iterate through the linked list of the head node 
        while(head != null){
            if(head.next.val == val){
                head.next = head.next.next; 
            }
            
            head = head.next; 
        }
        
        // skip the first node in the starter node 
        return dummy.next; 
    }
}