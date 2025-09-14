public class Car {
    private String modelNumber;
    private String partNumber;
    private String cost;
    public void setparameter(String x,String y,String z){
        modelNumber=x;
        partNumber=y;
        cost=z;
    }
    public void display(){
        System.out.println(modelNumber);
        System.out.println(partNumber);
        System.out.println(cost);
    }


    
}
