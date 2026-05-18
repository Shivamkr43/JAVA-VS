//Compile Time Polymorphism
public class ctpolymorfhism {

    void show(int a) {
        System.out.println(a);
    }

    void show(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {

        ctpolymorfhism p = new ctpolymorfhism();

        p.show(10);

        p.show("Java");
    }
}