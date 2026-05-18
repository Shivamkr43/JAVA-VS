// Thread Priority
class PriorityThread extends Thread {

    public void run() {

        System.out.println(Thread.currentThread().getPriority());
    }
}

public class priorthread {
    public static void main(String[] args) {

        PriorityThread p = new PriorityThread();

        p.setPriority(8);

        p.start();
    }
}