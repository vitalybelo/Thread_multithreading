public class Producer implements Runnable {

    private final Parking parking;

    public Producer(Parking parking) {
        this.parking = parking;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 1_000; i++) parking.in();
    }

}
