// Constructor Overloading
public class constructoroverloading {

    constructoroverloading() {
        System.out.println("Default Constructor");
    }

    constructoroverloading(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {

        constructoroverloading d1 = new constructoroverloading();

        constructoroverloading d2 = new constructoroverloading(10);
    }
}
