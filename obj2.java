//Object Return
public class obj2 {

    int x = 100;

    obj2 get() {
        return this;
    }

    public static void main(String[] args) {

        obj2 t = new obj2();

        System.out.println(t.get().x);
    }
}