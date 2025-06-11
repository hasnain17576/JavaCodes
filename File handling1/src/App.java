import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class App {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Hasnain wasool\\OneDrive\\Documents\\GitHub\\JavaCodes\\File handling1\\calculation.txt"); 

        System.out.println("File exist: " + file.exists());
        System.out.println("File Size: " + file.length());
        System.out.println("File modified date: " + new Date(file.lastModified()));

        PrintWriter output = new PrintWriter(file);
        int a = 5;
        int b = 5;
        int c = 5;
        output.println(a + "+" + b + "=" + c);
        output.close();

        if (file.exists()) {
            boolean check = file.exists();
            PrintWriter abc = new PrintWriter(new FileWriter(file));
            abc.println("File already exists");
            abc.close();
        } else {
            PrintWriter abc = new PrintWriter(file);
            abc.println("test msg");
            abc.close();
        }
    }
}
