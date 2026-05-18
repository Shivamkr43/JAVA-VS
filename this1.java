//  This Keyword
public class this1 {

    int x;

    this1(int x) {
        this.x = x;
    }

    void display() {
        System.out.println(x);
    }

    public static void main(String[] args) {

        this1 t = new this1(50);

        t.display();
    }
}