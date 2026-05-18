public class ExceptionAndThread {
    public static void divide(int a, int b) {
        try {
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }

    static class Task extends Thread {
        public void run() {
            System.out.println("Thread running");
        }
    }

    public static void main(String[] args) {
        Task t = new Task();
        t.start();
    }
}