//  Parameterized Constructor
public class con2 {

    int id;

    con2(int id) {
        this.id = id;
    }

    void display() {
        System.out.println(id);
    }

    public static void main(String[] args) {

        con2 e = new con2(101);

        e.display();
    }
}