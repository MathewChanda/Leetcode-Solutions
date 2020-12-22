public class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        // a - points to the beginning 
        // b - points to the end 
        int a_pointer = 0; 
        int b_pointer = 0; 
        
        // the length of the array 
        int max = 0; 
        HashSet<Character> hash_set = new HashSet<Character>(); 
        
        // iterate the pointer until we hit the end 
        while(b_pointer < s.length()){
            // add the current letter if it's not in the hashset 
            if(!hash_set.contains(s.charAt(b_pointer))){
                hash_set.add(s.charAt(b_pointer)); 
                b_pointer++; 
                max = Math.max(hash_set.size(),max);
            }
            
            // else remove the letter first pointer and don't move the b pointer and add its letter  
            else{
                hash_set.remove(s.charAt(a_pointer));
                a_pointer++; 
            }
        }
        
        
        return max;
    }
}