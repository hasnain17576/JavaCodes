import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch (button) {
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("hasnain");
            break;
            default: System.out.println("invalid button");

            
        }
   
    }
}

