// Thread Name
class NameThread extends Thread {

    public void run() {

        System.out.println(Thread.currentThread().getName());
    }
}

public class threadname {
    public static void main(String[] args) {

        NameThread t = new NameThread();

        t.start();
    }
}