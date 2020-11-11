class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> sStack = new Stack<Character>();
        Stack<Character> tStack = new Stack<Character>(); 
            
            
       for(int index = 0; index < S.length(); index++){
           Character letter = S.charAt(index); 
           if(letter != '#'){
               sStack.push(letter); 
           }
           
           else if(!sStack.empty()){
               sStack.pop(); 
           }
       }
        
        for(int index = 0; index < T.length(); index++){
           Character letter = T.charAt(index); 
           if(letter != '#'){
               tStack.push(letter); 
           }
           
           else if(!tStack.isEmpty()){
               tStack.pop(); 
           }
       }
        
        while(!tStack.empty() && !sStack.empty()){
            if( tStack.pop() != sStack.pop()){
                return false; 
            }
        }
        
        return tStack.empty() && sStack.empty(); 
    }
}