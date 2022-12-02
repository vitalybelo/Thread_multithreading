import java.util.ArrayList;

public class Main_Synchronized_Block {

    private static final ArrayList<Double> numbers = new ArrayList<>();

    public static void main(String[] args) {

        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            threads.add(new Thread(Main_Synchronized_Block::someHardMethod));
            threads.get(i).start();
        }
    }

    private static void someHardMethod () {

        for (int i = 0; i < 1_000_000; i++) {
            double value = Math.random() / Math.random();
            synchronized (numbers) {
                numbers.add(value);
            }
        }
        System.out.println(numbers.size());
        numbers.clear();
    }

}
