import java.util.Scanner;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
        
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public void displayResult(float a, float b) {
        System.out.println((a + b));
    }
}

class AdvancedCalculator extends Calculator {
    public void displayResult(float a, float b) {
        System.out.println((a + b));
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AdvancedCalculator c = new AdvancedCalculator();
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        System.out.println(c.add(i1, i2));
        
        int i3 = sc.nextInt();
        int i4 = sc.nextInt();
        int i5 = sc.nextInt();
        System.out.println(c.add(i3, i4, i5));
        
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println(c.add(d1, d2));
        
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();
        c.displayResult(f1, f2);

        sc.close();
    }
}
