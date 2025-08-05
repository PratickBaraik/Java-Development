import java.util.Scanner;

public class studentGradeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Student Grade Management System ===");
        System.out.println("1. Add Student Grade");
        System.out.println("2. View Grade Statistics");
        System.out.println("3. Grade Distribution");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter student marks (0-100): ");
                int marks = scanner.nextInt();

                if (marks >= 90 && marks <= 100) {
                    System.out.println("Grade: A+ (Excellent)");
                } else if (marks >= 80 && marks < 90) {
                    System.out.println("Grade: A (Very Good)");
                } else if (marks >= 70 && marks < 80) {
                    System.out.println("Grade: B (Good)");
                } else if (marks >= 60 && marks < 70) {
                    System.out.println("Grade: C (Average)");
                } else if (marks >= 50 && marks < 60) {
                    System.out.println("Grade: D (Pass)");
                } else if (marks >= 0 && marks < 50) {
                    System.out.println("Grade: F (Fail)");
                } else {
                    System.out.println("Invalid marks! Please enter between 0-100.");
                }
                break;

            case 2:
                System.out.println("Grade Statistics Feature - Coming Soon!");
                break;

            case 3:
                System.out.println("Grade Distribution Feature - Coming Soon!");
                break;

            case 4:
                System.out.println("Thank you for using the system!");
                break;

            default:
                System.out.println("Invalid choice! Please select 1-4.");
        }

        scanner.close();
    }
}
