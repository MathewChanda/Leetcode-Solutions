class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> pairs = new HashMap<Integer,Integer>(); 
        
        // loop through each of the elements in the array 
        for(int index = 0; index < nums.length; index++){ 
            // grab current element 
            int number = nums[index]; 
            
            // if element is already in the hashmap, return true 
            if(pairs.containsKey(number) == true){
                return true; 
            }
            
            // else put it in the hash map 
            pairs.put(number,1); 
        }
        
        
        return false;
    }
}