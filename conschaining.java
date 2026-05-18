//  Constructor Chaining
public class conschaining {

    conschaining() {

        this(10);

        System.out.println("Default");
    }

    conschaining(int x) {

        System.out.println(x);
    }

    public static void main(String[] args) {

        conschaining c = new conschaining();
    }
}