import java.util.Scanner;

public class App4 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        if (age < 18){
            System.out.println("adult");
        }else{
            System.out.println("not adult");
        }
    }
}    