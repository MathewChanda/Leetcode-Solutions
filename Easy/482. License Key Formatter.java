class Solution {
    public String licenseKeyFormatting(String S, int K) {
        // First, we would need to capitalize the string 
        // next, we need to remove the dashes. add it to a stack. 
        // finally, start adding the string with group of k. after we add a group of letters, append a dash. 
        // repeat the earlier step until we can't make anymore groups of k 
        // append the remaining letters at the end if stack is not empty 
        // return reverse string 
        
        S = S.toUpperCase(); 
        StringBuilder answer = new StringBuilder(); 
        int count = 0; 
        for(int index = S.length() - 1 ; index >= 0; index--){
            char letter = S.charAt(index); 
            
            if(letter == '-'){ 
                continue; 
            }
            
            
            if(K == count){ 
                count = 0; 
                answer.append('-'); 
            }
            
            answer.append(letter); 
            count++;
            
        }
        
        
        return answer.reverse().toString(); 
    }
}