public class DynamicArrays{
    // Static array that holds our values 
    public int[] arrays; 
    // Length of what the user thinks the size of the array is 
    public int userLength; 
    // Real capacity of the array 
    public int realLength; 

    // Initialize the size of the array to zero
    public DynamicArrays(){
        this.userLength = 0;
        this.realLength = 0;   
        this.arrays = new int[size]; 
    }

    public DynamicArrays(int size){
        this.userLength = size; 
        this.realLength = size; 
        this.arrays = new int[size]; 
    }
    
    public int size(){
        return userLength; 
    }

    public static void main(String[] args){

    }

    
}