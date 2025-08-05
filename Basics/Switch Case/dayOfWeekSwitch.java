import java.util.Scanner;

public class dayOfWeekSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Day of Week Finder ===");
        System.out.print("Enter a number (1-7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday - Start of the work week!");
                break;

            case 2:
                System.out.println("Tuesday - Second day of the week");
                break;

            case 3:
                System.out.println("Wednesday - Mid-week day");
                break;

            case 4:
                System.out.println("Thursday - Almost weekend!");
                break;

            case 5:
                System.out.println("Friday - Weekend is near!");
                break;

            case 6:
                System.out.println("Saturday - Weekend!");
                break;

            case 7:
                System.out.println("Sunday - Rest day");
                break;

            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

        scanner.close();
    }
}
