// Runnable Interface
class Demo implements Runnable {

    public void run() {
        System.out.println("Runnable Thread");
    }
}

public class interface3 {
    public static void main(String[] args) {

        Demo d = new Demo();

        Thread t = new Thread(d);

        t.start();
    }
}
