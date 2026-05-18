//  Encapsulation
public class Encaptulation {

    private int marks;

    void setMarks(int marks) {
        this.marks = marks;
    }

    int getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        Encaptulation s = new Encaptulation();

        s.setMarks(95);

        System.out.println(s.getMarks());
    }
}