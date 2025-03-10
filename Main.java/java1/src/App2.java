import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x%2==0){
            System.out.println("even");
        } else{
            System.out.println("odd");  
        }
    }
}
