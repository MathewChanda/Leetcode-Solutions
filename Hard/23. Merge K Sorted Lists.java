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
    public ListNode mergeKLists(ListNode[] lists) {
        // Space Complexity - O(Nlog(k))  where k is the number of linked lists and N being the number of nodes.
        
        // Time Complexity - O(N + K) - n for creating the linked list and K for the priority queue 
        // Create min heap 
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(); 
        for(int index = 0; index < lists.length; index ++){
            ListNode currentNode = lists[index]; 
            
            while(currentNode != null){
                heap.offer(currentNode.val); 
                currentNode = currentNode.next;     
            }
        }
        
        // Create the linked list 
        ListNode head = new ListNode(-1); 
        ListNode answer = head; 
    
        while(!heap.isEmpty()){
            answer.next = new ListNode(heap.poll()); 
            answer = answer.next; 
        }
        
        return head.next; 
    }
}