import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum= sum+i;
        }
        System.out.println("The sum of all natural numbers till " + N + " is: " + sum);
    }
}
