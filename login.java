// Simple Login
import java.util.Scanner;

public class login {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String user = "admin";
        String pass = "1234";

        System.out.print("Enter Username: ");
        String u = sc.nextLine();

        System.out.print("Enter Password: ");
        String p = sc.nextLine();

        if(user.equals(u) && pass.equals(p)) {

            System.out.println("Login Success");
        }

        else {

            System.out.println("Invalid Login");
        }
    }
}