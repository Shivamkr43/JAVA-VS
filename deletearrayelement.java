public class deletearrayelement { 
    public static void main(String[] args) { 
        StringBuffer buffer = new StringBuffer("Hello Java"); 
         
        buffer.delete(5, 10);   
        buffer.deleteCharAt(0);  
         
        System.out.println("After delete: " + buffer); 
    } 
} 
