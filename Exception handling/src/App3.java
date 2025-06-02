
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) throws Exception {
    try{
        int arr[]={5,0,1,2};
    try{
        int x=arr[3]/arr[1];
    }  
    catch(ArithmeticException ae) {
     System.out.println("divide by zero");

    }
    arr[4]=3; 
    }
    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("array index out od bound exception");
    }
    } 
}