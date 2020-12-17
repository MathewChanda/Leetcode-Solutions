class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> pairs = new HashMap<Integer,Integer>(); 
        int[] indices = new int[2]; 
        
        // loop through each index of the nums array 
        for(int index = 0; index < nums.length ;index++){
            // find the difference between the current number and the target 
            int difference = target - nums[index]; 
            
            // checks to see if the difference is a key 
            if(pairs.containsKey(difference)){
                indices[0] = pairs.get(difference); 
                indices[1] = index; 
            }
            
            // else put it the current number as the key and its index as the value 
            pairs.put(nums[index],index);
        }
        
        return indices; 
    }
}