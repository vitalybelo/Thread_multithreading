
public class Main_Wait_Notify {

    public static void main(String[] args) throws InterruptedException {

        Parking parking = new Parking();

        Thread thread1 = new Thread(new Producer(parking));
        Thread.sleep(1000);
        Thread thread2 = new Thread(new Consumer(parking));

        thread1.start();
        thread2.start();

    }

}
