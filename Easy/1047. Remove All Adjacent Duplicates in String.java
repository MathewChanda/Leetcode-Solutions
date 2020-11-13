class Solution {
    public String removeDuplicates(String S) {
        
        /// Populate the stack 
        Stack<Character> characters = new Stack<Character>(); 
        for(int index = 0; index < S.length(); index++){
            char letter = S.charAt(index); 
            
            if(characters.isEmpty() || letter != characters.peek()){
                characters.push(letter);
            }
            
            else{
                characters.pop();
            }
            
        }
       
        
        // 1. first populate the stack 
        // 2. add the character when the stack is empty or when the head and letter at a certain index are not the same. else, pop the head 
        // 3. Create a string from the stack by popping it 
        // 4. Reverse the string from step 3 since we are popping from the top of the string which contain the last letter 
        
        
        // pop the rest put it into a string 
        String reverse = ""; 
        
        
        while(characters.isEmpty() == false){
            reverse += characters.pop(); 
        }
        
        String answer = ""; 
        for(int index = reverse.length() - 1; index >= 0; index--){
            char letter = reverse.charAt(index); 
            answer += letter; 
        }
        
        return answer; 
        
    }
}