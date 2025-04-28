import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        // int number1 = (int)(Math.random()*10);
        // int number2 = (int)(Math.random()*10);
        // System.out.println("What is"+number1+"+"+number2+"?");
        // int answer = input.nextInt();
        // while (number1+number2!=answer) {
        //     System.out.print("Wrong answer . Try again . What is"+number1+"+"+number2+"?" );
        //     answer = input.nextInt();
        // }
        // System.out.println("you got it!");
        int limit;
        int number;
        int sum;
        int counter;
        System.out.println("Enter the number of"+"the integers of lists");
        limit = sc.nextInt();
        System.out.println();
        sum=0;
        counter = 0;
        System.out.println("Enter"+limit+"integers.");
        while (counter<limit) {
            number = sc.nextInt();
            sum =sum+number;
            counter++;

            
        }
        System.out.printf("The sum of the %d "+"numbers= %d%n",limit,sum);
        if (counter!=0){
            System.out.printf("The Average = %d%n",(sum/counter));
        }else{
            System.out.println("no input");
        }
        
    }
}
