import java.util.Scanner;

public class App1{
    public static int max(int a, int b) {
      int result;
      if (a > b)
        result= a;
      else
        result= b;
      return result;
    }


    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int number1= sc.nextInt();
      int number2=sc.nextInt();
      int larger = max(number1, number2);
      System.out.println("The larger number is: " + larger);
    }
  }
  
