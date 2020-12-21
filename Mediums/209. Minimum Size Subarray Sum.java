class Solution {
    public int minSubArrayLen(int targetSum, int[] arr) {
        
        // condition if the array is length of zero 
        if(arr.length == 0){
            return 0; 
        }
    
        
        int minWindowSize = Integer.MAX_VALUE;
        int currentWindowSum = 0;
        
        // Need a pointer
        int windowStart = 0;
        
        // Iterate and move the sliding window end in each iteration 
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            // summing each element into the summ 
            currentWindowSum += arr[windowEnd];

            // using the while loop to optimize the length of the array 
            while(currentWindowSum >= targetSum) {
                // updating the size
                minWindowSize = Math.min(minWindowSize, windowEnd - windowStart + 1);
                // removing the first element of the window 
                currentWindowSum -= arr[windowStart];
                // moving the window start pointer up 
                windowStart++;
            }
        }

        return (minWindowSize != Integer.MAX_VALUE) ? minWindowSize : 0;
    }
}
