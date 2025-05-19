public class App2 { 
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 40;
        int result = min(num1, num2);
        System.out.println("Minimum of " + num1 + " and " + num2 + " is: " + result);
    }
}
