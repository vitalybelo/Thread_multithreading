public class Main_Friend {


    public static void main(String[] args) {

        final Friend pitt = new Friend("Peter");
        final Friend maik = new Friend("Michael");

        new Thread(()-> pitt.throwBall(maik)).start();
        new Thread(()-> maik.throwBall(pitt)).start();

    }
}