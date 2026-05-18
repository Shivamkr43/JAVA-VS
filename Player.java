public class Player {
    int x = 0, y = 0;

    public void move(String direction) {
        switch (direction.toUpperCase()) {
            case "W": y++; break;
            case "S": y--; break;
            case "A": x--; break;
            case "D": x++; break;
        }
        System.out.println("Position: (" + x + ", " + y + ")");
    }
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.move("W"); // go up
        p1.move("D"); // go right
    }
}
