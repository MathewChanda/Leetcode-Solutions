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
* What I need to improve on :   
    - Traversing a linked list and its pointers 
    - First setup of the linked list 
*/ 

/* 
    What I struggled with in this problem 
        - How to setup the linked list 
        - Traversing the array 
        - Forgetting to traverse the dummy node and the smaller values node when comparing 
*/ 


class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        /*
        
        HOW TO SOLVE IT 
        1. First, create a dummy node and make another node called head and make its next points to the dummy node. 
           By doing this, we will start building the linked list 
        2. Next, we need to compares the node. Once we figured out, who's bigger and smaller. The dummy node's pointer 
           points to the smaller. Next, we need to move the pointer of the dummy node and the smaller node.  
        3. Finally, we need to figure out which linked list is smaller. The smaller linked list will have its next node is null.
           Then, we must append the bigger linked list to the dummy node. 
        4. Finally, we need to get the head.next to skip the first node in dummy linked list.  
        */ 
        
        // Setup the linked list
        ListNode dummy = new ListNode(-1); 
        ListNode head = dummy; 
        
        // Comparing the nodes and moving the pointer in the smaller value node
        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
                dummy.next = l2; 
                l2 = l2.next; 
            }
        
            else{
                dummy.next = l1;  
                l1 = l1.next; 
            }
            
            dummy = dummy.next;
        }
        
        // If L1 length is smaller than l2 length 
        if(l1 == null){
            dummy.next = l2; 
        }
        
        // If l2 length is smaller than l1 length 
        if(l2 == null){
            dummy.next = l1; 
        }
        
        return head.next; 
    }
}