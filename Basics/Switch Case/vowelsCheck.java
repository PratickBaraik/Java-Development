import java.util.Scanner;

public class vowelsCheck {
    public static void main(String[] args) {
        // defining scanner object 
        Scanner takeInput = new Scanner(System.in);

        System.out.print("Enter any character from a to z: ");
        char alphabet = takeInput.nextLine().charAt(0);

        switch(alphabet) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It's a vowel.");
            default:
                System.out.println("It's a consonant.");
        }
        // closing scanner object
        takeInput.close();
    }
}