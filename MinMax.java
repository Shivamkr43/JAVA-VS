public class MinMax {
    public static void main(String[] args) {
        int a = 45, b = 12;
        int largest = (a > b) ? a : b;
        int smallest = (a < b) ? a : b;
        
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}
