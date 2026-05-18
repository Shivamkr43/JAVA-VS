//  Interface
interface Camera {
    void click();
}

class Mobile implements Camera {

    public void click() {
        System.out.println("Photo Clicked");
    }
}

public class interface1 {
    public static void main(String[] args) {

        Mobile m = new Mobile();

        m.click();
    }
}