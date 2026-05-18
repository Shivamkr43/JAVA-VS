public class Temperature {
    public static void main(String[] args) {
        int temp = 25;
        if (temp < 15) {
            System.out.println("Cold");
        } else if (temp < 30) {
            System.out.println("Moderate");
        } else {
            System.out.println("Hot");
        }
    }
}
