//  Copy Constructor
public class copycons {

    int id;

    copycons(int id) {
        this.id = id;
    }

    copycons(copycons s) {
        id = s.id;
    }

    public static void main(String[] args) {

        copycons s1 = new copycons(1);

        copycons s2 = new copycons(s1);

        System.out.println(s2.id);
    }
}