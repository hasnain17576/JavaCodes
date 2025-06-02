import java.util.*;

public class App4 {
    public static void main(String[] args) throws Exception {
    Scanner input =new Scanner(System.in);
    int array[]={11,5,8,3,21,7,66,33,31,90};
    int choice=1;
    while(choice==1){
        try{
            System.out.println("enter an integer value  to search in array:");
            int n =input.nextInt();
            System.out.println("enter the index of array");
            int index =input.nextInt();
            if(array[index]==n){
                System.out.println("you won");
            }else{
                System.out.println("you lost");
             System.out.println("do you want to continue...(press 1for YES and 0 for No)");
             choice=input.nextInt();
            }
             if(choice==0)
             break;
            }
            catch(InputMismatchException ex){
                System.out.println("you have entered an invalid input type");
                System.out.println("try again");
                input.nextLine();
            }
            catch(ArrayIndexOutOfBoundsException ex2){
                System.out.println("you have entered an invalid index");
                System.out.println("try again");
                input.nextLine();

            }
        }

        }  
    }