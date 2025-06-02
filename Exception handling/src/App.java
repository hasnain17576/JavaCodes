import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int a ,b,choice;
        do
        {
            System.out.println("Enter 1st value ");
            a = input.nextInt();
            System.out.println("Enter the 2nd value");
            b= input.nextInt();
            System.out.println("1:Add\n2:Substract\n3:Multiply\n4:Divide\n5:Quit\nEnter your choice");
            choice=input.nextInt();
            try {
                switch (choice) {
                    case 1:
                    System.out.println(a+"+"+b+"="+(a+b));
                    break;
                    case 2:
                    System.out.println(a+"-"+b+"="+(a-b));
                     break;
                    case 3:
                    System.out.println(a+"*"+b+"="+(a*b));
                     break;
                    case 4:
                    System.out.println(a+"/"+b+"="+(a/b));
                    break;
                    case 5:break;
                    default:
                        System.out.println("you have entered an invalid choice");
                }
            } catch ( ArithmeticException e) {
                System.out.println("it is divide by Zero excreption");
                System.out.println("try again");
                // TODO: handle exception
            }
        }while (choice!=5);
            
        }
}
