import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        Car c1=new Car();
        System.out.println("What is modelNumber");
        String x=sc.nextLine();
        System.out.println("What is partNUmber");
        String y=sc.nextLine();
        System.out.println("what is cost");
        String z=sc.nextLine();
        c1.setparameter(x,y,z);
        c1.display();
        
        
        
        
        

    }
    
}
