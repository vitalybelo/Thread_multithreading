public class Parking {

    private final int parkingSize = 50;
    private int carCount = 0;

    public synchronized void in() {
        if (carCount == parkingSize) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        carCount++;
        System.out.println("Автомобиль запаркован.");
        System.out.println("Свободных мест на парковке: " + (parkingSize - carCount));
        notify();
    }

    public synchronized void out() {
        if (carCount == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        carCount--;
        System.out.println("Автомобиль покинул парковку.");
        System.out.println("Свободных мест на парковке: " + (parkingSize - carCount));
        notify();
    }

}

