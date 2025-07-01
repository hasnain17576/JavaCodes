 import java.io.File;
 import java.io.PrintWriter;

public class App {
    public static void main(String[] args) throws Exception {
        File file=new File("scores.txt");
        if(file.exists()){
            System.out.println("File already exists");
            System.exit(0);
        }
        try(PrintWriter output=new PrintWriter(file);){
        

        output.print("muhammad hasnain");
        output.println(45);
        output.print("arhamali bhatti");
        output.println(23);
        output.close();
    }
}
}
