import java.util.Scanner;

public class App2 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("equal");
         }else{
            if(a>b){
            System.out.println("a is greater than b" );
         }else{
            System.out.println("a is lesser than b");

         }

        }
    }
}
