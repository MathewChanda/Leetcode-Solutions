class Solution {
    public int lastStoneWeight(int[] stones) {
        
        // Time complexity : O(Nlog(n)) - the while loop is perform N - 1. Each iteration we are doing log(n) for every insertion and deletion. Therefore, O(Nlog(n))
        // Space Complexity : O(n) where n is the number of elements in the input array 
        
        // Create heap 
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(stones.length,Collections.reverseOrder()); 
        
        // populate the heap 
        for(int element : stones){
            heap.offer(element); 
        }
        
        // keep taking the biggest and second biggest element in the heap and taking the difference 
        // continue to do this until we have less than 2 elements in the heap 
        while(heap.size() >= 2){
            int firstStone = heap.poll(); 
            int secondStone = heap.poll(); 
            if(firstStone != secondStone){
                heap.offer(firstStone - secondStone); 
            }
        }
        
        // Special cases for empty case  
        if(heap.size() == 0){
            return 0; 
        }
        
        // return the first element in the heap 
        return heap.poll(); 
    }
}