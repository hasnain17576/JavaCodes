import java.util.Scanner;

public class App {
    // Method to return maximum of two numbers
    public static int max(int a, int b) {
        int result;
        if (a > b)
            result = a;
        else
            result = b;
        return result; // ✅ Return statement added
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        int larger = max(number1, number2); // ✅ Calling the method
        System.out.println("The larger number is: " + larger);

        sc.close(); // ✅ Optional: close the scanner
    }
}
