public class SwapWithoutTemp {
    public static void main(String[] args) {
        int a = 4834, b = 8585;
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.printf("a = %d b = %d", a, b);
    }
}
