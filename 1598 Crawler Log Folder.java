class Solution {

    // READ FUCKING DIRECTION DUMBASSS @ ME 
    public int minOperations(String[] logs) {
        // First, we need to keep track of the number of times that the person is moving away
        // Second, we increment only when going to a different folder and decrement when moving to the parent folder 
        // If we already at the folder, don't change the number * I had trouble on this but i didn't read the direction*
        // Traverse through the array. 
        // Check the type of string or cmd it is 
        // Increment or decrement based on the first comment 
        
        int num = 0;
        
        for(int index = 0; index < logs.length;index++){
            String cmd = logs[index]; 
            if(cmd.equals("../")){
                num--; 
            }
        
            else if(cmd.equals("./")){
                num+=0; 
            }
            
            else{
                num++; 
            }
            
            if(num < 0) num=0;
        }   
        
        if(num < 0){
            return 0; 
        }
        
        return num; 
    }
}