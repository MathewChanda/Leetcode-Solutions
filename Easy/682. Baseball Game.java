class Solution {
    public int calPoints(String[] ops) {
        // First, we need stack to keep of the numbers 
        // Loop through the array 
        // check if the element is a "C", remove the top of the stack
        // check if the element is a "D", remove the top of the stack, then double the value, then push to stack
        // check if the element is a "+", remove the top 2 items in the stack and add the two and push it to the stack 
        // else, push the number to the stack 
        // pop the remaining stack and add it to the sum 
        Stack<Integer> records = new Stack(); 
        for(int index = 0;index < ops.length;index++){
            String string = ops[index]; 
            if(string.equals("C")){
                records.pop(); 
            }
            
            else if(string.equals("D")){
               int topNum = records.pop(); 
               int doubleTopNum = topNum * 2;
               records.push(topNum); 
               records.push(doubleTopNum); 
            }
            
            else if(string.equals("+")){
                int top = records.pop();
                int newtop = top + records.peek();
                records.push(top);
                records.push(newtop);
            }
            
            else{
                records.push(Integer.parseInt(ops[index])); 
            }
        }
        
        
        int total = 0; 
        while(!records.empty()){
            total += records.pop(); 
        }
        
        return total; 
        
    }
}