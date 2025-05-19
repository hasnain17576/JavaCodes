public class App3{
    public static int min(int num1, int num2) {
        int result;   
        if (num1 < num2)
            result = num1;  
        else
            result = num2;  
        return result;  
    }
    public static void main(String[] args) {
        int x = 25;
        int y = 40;
        int z = min(x, y);

      
        System.out.println("The minimum value between " + x + " and " + y + " is: " + z);
    }
}
