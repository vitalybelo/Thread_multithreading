public class Main_Atomic_Value {

    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            new Thread(()-> {
                for (int j = 0; j < 1000; j++)
                    ValueStorage.incrementValue();
                System.out.println(ValueStorage.getValue());
            }).start();

        }
    }

}
