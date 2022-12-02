import java.util.ArrayList;

public class Main_Synchronized {

    private static final ArrayList<Double> numbers = new ArrayList<>();

    public static void main(String[] args) {

        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            threads.add(new Thread(Main_Synchronized::someHardMethod));
            threads.get(i).start();
        }
    }

    // в таком виде этот метод будет работать автономно в каждом потоке
    private static synchronized void someHardMethod () {

        for (int i = 0; i < 1_000_000; i++) {
            numbers.add(Math.random() / Math.random());
        }
        System.out.println(numbers.size());
        numbers.clear();
    }

}
