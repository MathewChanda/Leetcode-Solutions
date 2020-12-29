class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Create hash map from the input array
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(); 
        for(int index = 0; index < nums.length; index++){
            int currentNum = nums[index]; 
            map.put(currentNum,map.getOrDefault(currentNum,0) +1); 
        }
        
        // Create min heap
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>( new Comparator<Integer>(){
            @Override 
            public int compare(Integer word1,Integer word2){
                return map.get(word1) - map.get(word2); 
            }
        });
         
        // Create min heap from hash map 
        for(int key : map.keySet()){
            heap.offer(key); 
            while(heap.size() > k){
                heap.poll(); 
            }
        }
        
        // Create new result
        int[] result = new int[k]; 
        for(int index = 0; index < result.length; index++){
            result[index] = heap.poll(); 
        }
        
        return result; 
    }
}