public class TaskRunnable implements Runnable {

    private long counter;
    //private boolean isRunning;        // сначала запускаем так
    private volatile boolean isRunning;

    public TaskRunnable() {
        counter = 0;
        isRunning = true;
    }

    @Override
    public void run() {
        while (isRunning) {
            counter++;
        }
        System.out.println("FROM RUN: " + counter);
    }

    public void stop() {
        isRunning = false;
    }

    public long getCounter() {
        return counter;
    }
}
