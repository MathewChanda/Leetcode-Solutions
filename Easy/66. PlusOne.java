import java.util.*;

class Solution {
    public int[] plusOne(int[] digits) {
        // edge cases : anything with 9 and only 9s 
        // edge cases with a 9 
        // loop through the end of the array. if we have a 9, change it to a zero. Else, add one to the certain place 
        // edge cases all of the array will be 0 if we are at the end 
        // so, we will need to make a new array with old array's length + 1, which have the first element as one 
        
        int length = digits.length; 
        for(int index = length - 1; index >= 0; index--){ 
            if(digits[index] < 9){ 
                digits[index] += 1; 
                return digits;
            }
            
            else{ 
                digits[index] = 0; 
            }
        }
        
        
        digits = new int[length + 1]; 
        digits[0] = 1; 
        
        return digits; 
    }
}