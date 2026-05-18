//  String Split
public class strsplit {
    public static void main(String[] args) {

        String s = "Java Python C";

        String arr[] = s.split(" ");

        for(String i : arr) {
            System.out.println(i);
        }
    }
}