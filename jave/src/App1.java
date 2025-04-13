import java.util.Scanner;

public class App1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the start num:");
        int M=sc.nextInt();
        System.out.println("enter the end num:");
        int N=sc.nextInt();
        int sum=0;
        for(int i=M;i<=N;i++){
            sum=sum+i;
    }
        System.out.println("the sum of num from"+M+" to "+N+"is"+sum);
    }
  
}
    
