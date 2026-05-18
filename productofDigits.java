import java.util.Scanner;
public class productofDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int product = 1;

        for (; n != 0; n = n / 10) {
            int digit = n % 10;
            product = product * digit;
        }
          
        System.out.println("Product of digits: " + product);

        sc.close();
    }
}