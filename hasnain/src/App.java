import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int age= sc.nextInt();
        if(age>18) {
            System.out.println("Adult");
        } else {
            System.out.println("not adullt");
        }

    }
}
