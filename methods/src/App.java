import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int [] marks = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<marks.length; i++)
        {
            System.out.println("Enter the marks");
            marks[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0; i<marks.length; i++)
        {
            sum=sum+marks[i];

        }
        int avg= sum/marks.length;
        System.out.println("avg marks are"+avg);
        int count_above=0;
        int count_below=0;
        for(int i=0;i<marks.length;i++)
        {
            if (marks[i]>avg) {
                count_above++;
            }else{
                count_below++;

            }
        }

        System.out.println("above avg"+count_above);
         System.out.println("below avg"+count_below);
    }
}
