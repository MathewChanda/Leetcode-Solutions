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
        this.arrays = new int[0]; 
    }

    // Initialize the size of the array to desired array 
    public DynamicArrays(int size){

        if(size < 0){
            throw new IllegalArgumentException("Desired size is a negative number"); 
        }

        this.userLength = size; 
        this.realLength = size; 
        this.arrays = new int[size]; 
    }
    
    // Returns the size of the array
    public int size(){
        return userLength; 
    }

    // Returns true if the array is empty, else it will return false 
    public boolean isEmpty(){
        return userLength == 0; 
    }

    // Set the element to a certain index 
    public void set(int index, int element){
        if(index > realLength){
            throw new IllegalArgumentException("Desired index is greater than array\'s length"); 
        }

        if(index < 0){
            throw new IllegalArgumentException("Desired Index is a negative number"); 
        }

        arrays[index] = element; 
    }

    // Returns an element at a certain element 
    public int get(int index){
        return arrays[index]; 
    }

    // Set all values in the array to zero 
    public void clear(){ 
        for(int index = 0; index < arrays.length; index++){ 
            arrays[index] = 0;  
        }

        userLength = 0; 
    }
    



    public static void main(String[] args){
        DynamicArrays array1 = new DynamicArrays(); 
        DynamicArrays array2 = new DynamicArrays(2); 

        System.out.println(array1.size()); 
        System.out.println(array2.size());
        System.out.println("Is Array 1 Empty: " + array1.isEmpty());
        System.out.println("Is Array 2 Empty: " + array2.isEmpty()); 
        System.out.println("At the first index, the element is "+ array2.get(0));  
        array2.set(0,1);
        System.out.println("I set the first index of the second array to " + array2.get(0)); 
    }

    
}