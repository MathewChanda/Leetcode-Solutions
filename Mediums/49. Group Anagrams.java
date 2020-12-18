class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // Hint: Sort it and put it into a form that you can view all of them as the same 
        
        List<List<String>> result = new ArrayList<>(); 
        
        // Mapping sorted string to all strings when sorted will be exactly the same as the key 
        HashMap<String,List<String>> computed = new HashMap<String,List<String>>(); 
        
        // iterate through each string 
        for(String word: strs){
            
            // get the letters as a array of chars which will be sorted
            char [] letters = word.toCharArray(); 
            Arrays.sort(letters); 
            
            // if the sorted array as a string is not a key, make an entry with its the key and the empty array as the value 
            if(!computed.containsKey(new String(letters))){
                computed.put(new String(letters),new ArrayList<>()); 
            }
            
            // append word to the value of the key 
            computed.get(new String(letters)).add(word); 
        }
        
        
        // pushing values to the arraylist 
        result.addAll(computed.values()); 
        return result; 
        
    }
}