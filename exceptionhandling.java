import java.util.*;

public class exceptionhandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("numerator: ");
            int a = sc.nextInt();

            System.out.print("denominator: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Error: value is not defined.");
            
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");

        } finally {
            System.out.println("Execution finished.");
            sc.close();
        }
    }
}