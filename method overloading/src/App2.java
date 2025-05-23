import java.util.Scanner;

public class App2 {
    public static double celsiustoFahrenheit(double celsius ){
        return(9.0/5*celsius)+32;
}
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the temperature celsius");
        double celsius = sc.nextDouble();
        double Fahrenheit = celsiustoFahrenheit(celsius);
        System.out.println("temperature in Fahrenteit"+Fahrenheit);

    
    } 
}
