import java.util.Scanner;

public class App1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("equal");
        }else if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("a is leeser than b");
        }
    }
}

