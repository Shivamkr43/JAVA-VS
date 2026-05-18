//  Multiple Interface
interface Music {
    void play();
}

interface Video {
    void show();
}

class Media implements Music, Video {

    public void play() {
        System.out.println("Music Play");
    }

    public void show() {
        System.out.println("Video Show");
    }
}

public class mulinterface {
    public static void main(String[] args) {

        Media m = new Media();

        m.play();
        m.show();
    }
}