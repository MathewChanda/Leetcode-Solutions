class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        // Create hashmap for each 
        HashMap<String,Integer> map = new HashMap<String,Integer>(); 
        for(String word : words){
           map.put(word,map.getOrDefault(word,0) + 1 ); 
        }
        
        // Create prority queue 
        PriorityQueue<String> heap = new PriorityQueue<String>( new Comparator<String>(){
            @Override 
            public int compare(String word1,String word2){
                if(map.get(word1) == map.get(word2)){
                    System.out.print(word2.compareTo(word1));
                    return word2.compareTo(word1); 
                }
                
                return map.get(word1) - map.get(word2); 
            }
        });
            
            
        for(String key : map.keySet()){
            heap.offer(key); 
            if(heap.size() > k){
                heap.poll(); 
            }
        }
        
        // Create list from the heap 
        List<String> result = new ArrayList<String>(); 
        while(!heap.isEmpty()){
            result.add(heap.poll()); 
        }
        
        // Reverse the list since we used a min heap at the beginning 
        Collections.reverse(result); 
        return result; 
    }
}