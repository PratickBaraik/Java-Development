// package Problems.Basic;

// grade calculator
import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        // defining scanner object
        Scanner takeInput = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = takeInput.nextInt();

        // printing marks
        System.out.println("Your marks are: " + marks);

        // printing grade based on marks
        if(marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        } else if(marks >= 80 && marks < 90) {
            System.out.println("Grade: B");
        } else if(marks >= 70 && marks < 80) {
            System.out.println("Grade: C");
        } else if(marks >= 60 && marks < 70) {
            System.out.println("Grade: C");
        } else if(marks < 60 && marks > 0) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Invalid score! enter valid marks between 0 to 100.");
        }

        takeInput.close();
    }
}