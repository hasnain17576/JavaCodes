import java.util.Scanner;
import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("scores.txt");  // correct extension
        Scanner input = new Scanner(file);
        
        while (input.hasNext()) {
            String firstName = input.next();
            String middleName = input.next();
            String lastName = input.next();
            int scores = input.nextInt();
            
            System.out.println(firstName + " " + middleName + " " + lastName + " " + scores);
        }

        input.close();
    }
}