import java.util.Scanner;

public class trafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Traffic Light System ===");
        System.out.println("Available colors:");
        System.out.println("R - Red");
        System.out.println("Y - Yellow");
        System.out.println("G - Green");
        System.out.print("Enter traffic light color (R/Y/G): ");

        char color = scanner.next().toUpperCase().charAt(0);

        switch (color) {
            case 'R':
                System.out.println("🔴 STOP! Do not cross the road.");
                System.out.println("Wait for green light.");
                break;

            case 'Y':
                System.out.println("🟡 CAUTION! Prepare to stop.");
                System.out.println("Do not start crossing.");
                break;

            case 'G':
                System.out.println("🟢 GO! Safe to cross the road.");
                System.out.println("Proceed with caution.");
                break;

            default:
                System.out.println("❌ Invalid color! Please enter R, Y, or G.");
        }

        scanner.close();
    }
}
