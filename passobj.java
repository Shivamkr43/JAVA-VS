// Object Passing
class Box {
    int value;

    Box(int value) {
        this.value = value;
    }
}

public class passobj {

    void display(Box b) {
        System.out.println(b.value);
    }

    public static void main(String[] args) {

        Box b = new Box(10);

        passobj t = new passobj();

        t.display(b);
    }
}