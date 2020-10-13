/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


/*

What I need to improve on! 
    - How pointers work 

What I struggle with! 
    - How pointers can set vals of your node and remove nodes 
*/ 




class Solution {
    public void deleteNode(ListNode node) {
       //Duplicate your next node value 
        node.val = node.next.val;
        // Skip the next node by referring to the following node as the next node of the param node 
       node.next = node.next.next; 
    }
}