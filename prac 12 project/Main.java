import java.util.Scanner;

// Stopwatch class
class Stopwatch {
    private long startTime;
    private long endTime;
    private boolean running = false;

    // Start stopwatch
    public void start() {
        if (!running) {
            startTime = System.currentTimeMillis();
            running = true;
            System.out.println("Stopwatch started.");
        } else {
            System.out.println("Stopwatch already running!");
        }
    }

    // Stop stopwatch
    public void stop() {
        if (running) {
            endTime = System.currentTimeMillis();
            running = false;

            long elapsed = endTime - startTime;
            double seconds = elapsed / 1000.0;

            System.out.println("Elapsed time: " + seconds + " seconds.");
        } else {
            System.out.println("Stopwatch is not running!");
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stopwatch sw = new Stopwatch();

        int choice;

        do {
            // Menu
            System.out.println("\n===== STOPWATCH MENU =====");
            System.out.println("1. Start Stopwatch");
            System.out.println("2. Stop Stopwatch");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sw.start();
                    break;

                case 2:
                    sw.stop();
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}