class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> num1Set = new HashSet<Integer>(); 
        HashSet<Integer> commons = new HashSet<Integer>(); 
        
        // populate the hashset 
        for(int num : nums1){
            num1Set.add(num); 
        }
        
        // iterate over the second array 
        for(int num: nums2){
            
            // if the current element is in the other hashset then put it into the common hashmset
            if(num1Set.contains(num)){
                commons.add(num); 
            }
        }
        
        // populate the array 
        int[] result = new int[commons.size()]; 
        int index = 0; 
        for(int intersection : commons){
            result[index++] = intersection; 
        }
        
        return result; 
    }
}.