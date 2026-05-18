public class StringBufferLengthCapacity { 
    public static void main(String[] args) { 
        StringBuffer buffer = new StringBuffer("Hello"); 
         
        System.out.println("Length: " + buffer.length()); 
        System.out.println("Capacity: " + buffer.capacity()); 
    } 
} 
