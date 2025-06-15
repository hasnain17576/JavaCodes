
import java.util.Scanner;




public class App {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two integers");
        int number1=input.nextInt();
        int number2=input.nextInt();
         System.out.println("Number1 divide Number2"+number1/number2);
    }
}
