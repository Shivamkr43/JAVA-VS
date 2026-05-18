// Join Method
class JoinThread extends Thread {

    public void run() {
        System.out.println("Child Thread");
    }
}

public class join {
    public static void main(String[] args) throws Exception {

        JoinThread j = new JoinThread();

        j.start();

        j.join();

        System.out.println("Main Thread");
    }
}