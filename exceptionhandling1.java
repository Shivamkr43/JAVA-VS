//  Exception Handling
public class exceptionhandling1 {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        }

        catch (Exception e) {
            System.out.println("Exception Handled");
        }
    }
}