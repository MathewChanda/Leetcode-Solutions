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
       /*
           Replaces the node until the new head is not the unwanted value 
        */ 
        while(head != null && head.val == val){ 
            head = head.next; 
        }
        
        
        
        // linked list is created with reference to the param linked list 
        ListNode currentNode = head; 
        
        // Traversing the linked list
        // Need to check if the node and after are not null
        while(currentNode != null && currentNode.next != null){
            // if the next node contains val 
            if(currentNode.next.val == val){
                // point to the following node 
                currentNode.next = currentNode.next.next; 
            }
            
            // else move the pointer 
            else{
                  currentNode = currentNode.next; 
            }
        }
        
        
        return head; 
    }
}
