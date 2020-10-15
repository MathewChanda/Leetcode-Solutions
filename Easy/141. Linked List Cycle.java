
 class ListNode {
      int val;
     ListNode next;
      ListNode(int x) {
         val = x;
         next = null;
      }
 }


/*
    What I need to remember : 
        Remember that pointers are needed to move and traverse the linked list. 
        In the while loop that we using to traverse, we need to ensure that the 
        condition is what the node contains in the linked list such as being null
*/ 



public class Solution {
    public boolean hasCycle(ListNode head) {
        /*
            The first pointer that goes one node at the time. 
            The second pointer that goes two nodes ahead of the first pointer. 
            
            edge cases 
            1.) check if the list is not empty 
            2.) check if the list is single
            
            
            1.) Iterate through the node with both pointer until the two pointers points                to the same value 
            2.) check if the pointer are pointing to the same value 
            3.) if the second pointer points to null, we return false. 
            4.) if we exit the loop that iterates, we return true 
        */ 
        
            // checks if the node is null
            if(head == null){
                return false; 
            }
        
            // create two pointers that points to various node 
            ListNode slow = head; 
            ListNode fast = head.next; 
        
            // check until they are the same 
            while(slow != fast){
                // if fast pointer is at the end, return false
                if(fast == null || fast.next == null){
                    return false; 
                }
                
                // moving the pointers 
                slow = slow.next; 
                fast = fast.next.next; 
            }
        
        
            return true; 
        
       
        
    }
}