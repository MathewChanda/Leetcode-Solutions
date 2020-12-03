class Solution {
    public int missingNumber(int[] nums) {
        // add all numbers of the nums to see expected sum called expectedSum 
        // we know that the expected sum of nums from 0 to n would be bigger than the expected sum of the the passed in array 
        // iterate all numbers in the nums and put into a varaible called currentSum 
        
        
        int currentSum = 0; 
        int expectedSum = 0; 
        
        for(int num = 0; num <= nums.length; num++){
            expectedSum += num; 
        }
        
        for(int index = 0; index < nums.length; index++ ){ 
            currentSum += nums[index]; 
        }
        
        return expectedSum - currentSum; 
    }
}