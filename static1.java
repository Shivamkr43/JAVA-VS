//  Static Variable
public class static1 {

    static int count = 0;

    static1() {
        count++;
    }

    public static void main(String[] args) {

        new static1();
        new static1();

        System.out.println(count);
    }
}