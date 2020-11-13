class Solution {
    public boolean isValid(String s) {
        // first we need to iterate through the characters in the string 
        // If the char is [, (, {,, put this in the stack 
        // else, 
        // if the stack is empty, return false 
        // else if top of the stack is "[" and the character char is not "]", return false 
        // else if top of the stack is "{" and the character char is not "}", return false  
        // else if top of the stack is "(" and the character char is not ")", return false 
        // else, pop the stack (means we found [], {},())
        // return condition of stack being empty 
        
        
        
        Stack <Character> set = new Stack(); 
        
        for(int index = 0; index < s.length(); index++){
            char character = s.charAt(index); 
            
            
            if(character == '{' || character == '[' || character == '('){
                set.push(character); 
            }
            
            
            else{
                if(set.empty()){
                    return false; 
                }
                
                
                else if(set.peek() == '{' && character !='}'){
                    return false; 
                }
                
                
                else if(set.peek() == '[' && character !=']'){
                    return false; 
                }
                
                else if(set.peek() == '(' && character !=')'){
                    return false; 
                }
                
                else{
                    set.pop(); 
                }
            }
            
        }
        
        
        return set.isEmpty(); 
    }
}