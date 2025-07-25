import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);

        System.out.println("Enter your marks: ");
        int marks = takeInput.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade A");
            System.out.println("Excellent!");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Grade B");
            System.out.println("Well Done!");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Grade C");
            System.out.println("Good job you can do better.");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Grade D");
            System.out.println("Try harder next time.");
        } else if (marks > 100 || marks <= 0) {
            System.out.println("Please enter valids marks between 1 to 100.");
        } else {
            System.out.println("Grade F");
            System.out.println("You need to work much harder.");
        }

        takeInput.close();
    }
}
