import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any alphabet: ");
        char ch = input.next().charAt(0); // taking first character of input

        // Convert to lowercase to handle both uppercase and lowercase letters
        ch = Character.toLowerCase(ch);

        // Check if input is a letter
        if ((ch >= 'a' && ch <= 'z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("It is a vowel.");
            } else {
                System.out.println("It is not a vowel.");
            }
        } else {
            System.out.println("Invalid input. Please enter an alphabet.");
        }

        input.close();
    }
}

    
