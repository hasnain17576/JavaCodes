import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (N): ");
        int N = scanner.nextInt();

        System.out.println("Even numbers from 1 to " + N + " are:");
        for (int i = 2; i <= N; i=i+2) { 
                System.out.println(i);
        }

        scanner.close();
    }
}
