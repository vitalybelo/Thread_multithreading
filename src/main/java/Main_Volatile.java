import java.util.Scanner;

public class Main_Volatile {

    public static void main(String[] args) {

        TaskRunnable task = new TaskRunnable();
        new Thread(task).start();

        System.out.print("Press any key: ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        task.stop();

        System.out.println("FROM MAIN: " + task.getCounter());

    }

}
