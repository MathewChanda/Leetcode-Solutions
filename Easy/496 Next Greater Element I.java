class Solution {
    
    // Hardest part of the problem is finding the most right number 
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> numbers = new HashMap(); 
        Stack<Integer> bigNum = new Stack(); 
        // First, we need to make an hash map of the elements in the 2nd arrays and its right most element 
        // Iterate through the second array to create the hash map 
        // now, we check if the stack is empty and if the stack is empty and the top element in the stack is greater than the incoming number, we don't put anything in the hashmap instead we put it in the stack. 
        // else we populate the hashmap with the key being the top element in the stack and the number at the current index 
        for(int index = 0; index < nums2.length; index++){ 
            int number = nums2[index]; 
            while(!bigNum.empty() && bigNum.peek() < number){
                numbers.put(bigNum.pop(),number); 
            }
            
            bigNum.push(number);
        }
        
        
        // Go through the first array and check if it's in the hashmap
        for(int index = 0; index < nums1.length; index++){
            nums1[index] = numbers.getOrDefault(nums1[index], -1);
        }

        return nums1; 
    }
}