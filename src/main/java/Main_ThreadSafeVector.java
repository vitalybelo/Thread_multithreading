import java.util.ArrayList;
import java.util.Vector;

public class Main_ThreadSafeVector {

/**
*   private static ArrayList<Double> numbers = new ArrayList<>();
*   Vector :: Потоко-безопасный класс коллекции ArrayList
*/
    private static final Vector<Double> numbers = new Vector<>();

    public static void main(String[] args) {

        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 100; i++)
        {
            threads.add(new Thread(()->{
                for (int j = 0; j < 100_000; j++)
                    numbers.add(Math.random());
                System.out.println(numbers.size());
            }));
            threads.get(i).start();
        }
    }

}
