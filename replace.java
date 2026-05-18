public class replace { 
    public static void main(String[] args) { 
        StringBuffer buffer = new StringBuffer("Hello World"); 
         
        buffer.replace(6, 11, "Java");  
         
        System.out.println("After replace: " + buffer); 
    } 
} 