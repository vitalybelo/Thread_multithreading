import java.util.concurrent.atomic.AtomicInteger;

public class ValueStorage {

    //private int value;
    private static final AtomicInteger value = new AtomicInteger();

    public static  void incrementValue() {
        //value = value + 1;
        value.incrementAndGet();
    }

    public static int getValue() {
        //return value;
        return value.intValue();
    }

}
