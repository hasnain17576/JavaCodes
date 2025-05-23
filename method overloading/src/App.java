public class App {
    public static int max(int a , int b){
        int result;
    if (a>b) {
        result = a;
    } else {
        result = b;
    }
      return  result ;
}
    public static void main(String[] args) throws Exception {
      int num1=45;
      int num2=34;
      int result= max(num1, num2);
      System.out.println("the maximium of"+num1+"and"+num2+"is::"+result);
    } 
}
