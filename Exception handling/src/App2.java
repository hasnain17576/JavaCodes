import java.util.InputMismatchException;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        while(true){
            try{
                Scanner input=new Scanner(System.in);
                System.out.println("enter an integer value");
                int n =input.nextInt();
                System.out.println("Factorial="+factorial(n));
                break;
             }
             catch(InputMismatchException ex){
               System.out.println("you have entered an invalid input");
               System.out.println("try again"); 

             }
        }
        }
         static int factorial (int n){
            int f=1;
            for(int i=1;i<=n;i++)
            f=f*i;
            return f;
         }
        }