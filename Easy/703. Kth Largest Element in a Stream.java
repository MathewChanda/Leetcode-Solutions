class KthLargest {
    private PriorityQueue<Integer> minHeap; 
    private int k;
    
    // Constructor
    public KthLargest(int k, int[] nums) {
        
        // create the minHeap and setting specified kth 
        this.minHeap = new PriorityQueue<Integer>();
        this.k = k; 
        for(int element : nums){
            this.minHeap.offer(element); 
        }
    }
    
    public int add(int val) {
        // add value to the minheap 
        this.minHeap.add(val); 
        
        // here we want the kth node in the minheap as the first node in the minheap 
        // therefore, we need to remove the first set of nodes before the kth node.
        while(k < this.minHeap.size()){
            this.minHeap.poll(); 
        }
        
        // return the first node in the minheap 
        return this.minHeap.peek(); 
    }
}