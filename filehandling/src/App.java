import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class App {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Hasnain wasool\\OneDrive\\Documents\\GitHub\\JavaCodes\\filehandling\\src\\scores.txt");

        System.out.println("File exist: " + file.exists());
        System.out.println("File size: " + file.length());
        System.out.println("File modifiable date: " + new Date(file.lastModified()));

        PrintWriter output = new PrintWriter(file);
        int a = 5;
        int b = 10;
        int c = a + b;
        output.println(a + " + " + b + " = " + c);
        output.close();

        if (file.exists()) {
            PrintWriter abc = new PrintWriter(new FileWriter(file, true));
            abc.println("File already exists, new content appended.");
            abc.close();
        } else {
            PrintWriter abc = new PrintWriter(file);
            abc.println("text msg");
            abc.close();
        }
    }
}
