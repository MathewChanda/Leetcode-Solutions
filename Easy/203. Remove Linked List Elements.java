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
    - Edge cases of vals and nodes i.e if the unwanted val is at the beginning and empty node/single node 
    
    
    - Referencing head and changing that variable that referenced head will change head at the same. It will not move where head is at as well. 
    - We checking for head.next != null when we are doing any operations with head.next.next. 
   
    
What I struggle with 
    - Which node that I need to start in my while loop 
    - what to do when node is null or the beginning node contains the unwanted value 
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
