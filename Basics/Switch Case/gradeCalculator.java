import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        // Defining scanner for taking input
        Scanner takeInput = new Scanner(System.in);

        System.out.print("Enter your score (0 - 10): ");
        int score = takeInput.nextInt();

        switch (score / 10) {
            case 10:
                System.out.println("A+, Excellent");
                break;

            case 9:
                System.out.println("A, Well done");
                break;

            case 8:
                System.out.println("B, Good job");
                break;

            case 7:
                System.out.println("C, Well tried");
                break;

            case 6:
                System.out.println("D, You can do better");
                break;

            default:
                System.out.println("E, Work harder");
        }

        takeInput.close();
    }
}