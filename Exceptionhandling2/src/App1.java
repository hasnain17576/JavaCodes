
import java.util.Scanner;

public class App1{
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two integers");
        int number1=input.nextInt();
        int number2=input.nextInt();
        if(number2!=0){
        System.out.println("Number1 divide Number2"+number1/number2);
        }
        else{
            System.out.println("divisor cannot be zero");
        }
         
    }
}
