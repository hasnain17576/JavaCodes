import java.util.Scanner;
import java.util.InputMismatchException;

public class App1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Please enter an integer: ");
            try {
                number = scanner.nextInt(); 
                System.out.println("Thank you! You entered: " + number);
                break; 
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. That is not an integer. Please try again.");
                scanner.nextLine(); 
            }
        }

        scanner.close();
    }
}
