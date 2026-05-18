public class StringMethod{ 
    public static void main(String[] args) { 
        String str = "  Hello Java!  "; 
        String trimmedStr = str.trim(); 
        int length = str.length(); 
        boolean containsJava = str.contains("Java"); 
         
        System.out.println("Trimmed String: '" + trimmedStr + "'"); 
        System.out.println("Length: " + length); 
        System.out.println("Contains 'Java': " + containsJava); 
    } 
}
