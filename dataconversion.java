public class dataconversion { 
    public static void main(String[] args) { 
        int num = 100; 
        double price = 99.99; 
         
        String strNum = String.valueOf(num);  
        String strPrice = String.valueOf(price);  
         
        System.out.println("Converted int: " + strNum); 
        System.out.println("Converted double: " + strPrice); 
    } 
} 