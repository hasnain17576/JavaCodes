
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class App {
    public static void main(String[] args) throws Exception {
       if(args.length!=4){
        System.out.println("Usage:java replaceText sourceFile targetFile oldString newString");
       System.exit(1);
    }
    File SourceFile=new File(args[0]);
    if(!SourceFile.exists()){
        System.out.println("Source file " + args[0] + " does not exist");
        System.exit(2);
    }
    File TargetFile=new File(args[1]);
    if(!TargetFile.exists()){
        System.out.println("Target file " + args[1] + " does not exist");
        System.exit(3);
    }
    try (
        Scanner input = new Scanner(SourceFile);
        PrintWriter output = new PrintWriter(TargetFile);)
        {
            while (input.hasNextLine()) {
                String s1 = input.nextLine();
                String s2 = s1.replace(args[2], args[3]);
                output.println(s2);
            }
        }


}
}
