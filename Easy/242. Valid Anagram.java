class Solution {
    public boolean isAnagram(String s, String t) {
    
       if(s.length() != t.length()){
         return false; 
       }
        
       HashMap<Character,Integer> letters = new HashMap<Character,Integer>(); 
       for(int index = 0; index < s.length(); index++){
           char letter = s.charAt(index); 
           letters.put(letter,letters.getOrDefault(letter,0) + 1); 
       }
        
       for(int index = 0; index < t.length(); index++){
           char letter = t.charAt(index); 
           letters.put(letter,letters.getOrDefault(letter,0) - 1); 
       }
        
       for(int amount : letters.values()){
           if(amount != 0 ){
               return false; 
           }
       }
       
        
        
        
      return true; 
    }
}