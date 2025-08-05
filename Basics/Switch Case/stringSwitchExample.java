import java.util.Scanner;

public class stringSwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== String Switch Example ===");
        System.out.println("Available commands:");
        System.out.println("start, stop, pause, resume, exit");
        System.out.print("Enter command: ");

        String command = scanner.nextLine().toLowerCase();

        switch (command) {
            case "start":
                System.out.println("🚀 System starting...");
                System.out.println("Initializing components...");
                System.out.println("System started successfully!");
                break;

            case "stop":
                System.out.println("🛑 System stopping...");
                System.out.println("Saving data...");
                System.out.println("System stopped safely!");
                break;

            case "pause":
                System.out.println("⏸️ System pausing...");
                System.out.println("Current state saved.");
                System.out.println("System paused.");
                break;

            case "resume":
                System.out.println("▶️ System resuming...");
                System.out.println("Restoring state...");
                System.out.println("System resumed!");
                break;

            case "exit":
                System.out.println("👋 Exiting system...");
                System.out.println("Goodbye!");
                break;

            default:
                System.out.println("❌ Unknown command: " + command);
                System.out.println("Available commands: start, stop, pause, resume, exit");
        }

        scanner.close();
    }
}
