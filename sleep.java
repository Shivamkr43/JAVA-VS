//Sleep Method
class SleepThread extends Thread {

    public void run() {

        try {
            Thread.sleep(1000);

            System.out.println("Thread Wake Up");
        }

        catch(Exception e) {
            System.out.println(e);
        }
    }
}

public class sleep {
    public static void main(String[] args) {

        SleepThread s = new SleepThread();

        s.start();
    }
}