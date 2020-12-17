class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> pairs = new HashMap<Integer,Integer>(); 
        
        for(int index = 0; index < nums.length; index++){ 
            int number = nums[index]; 
            
            if(pairs.containsKey(number) == true){
                return true; 
            }
            
            pairs.put(number,1); 
        }
        
        
        return false;
    }
}