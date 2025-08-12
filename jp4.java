public class jp4{
    public static void main(String args[]){
        try{
            int a=10/0;
            System.out.println("the answer is : " + a);
        }catch(ArithmeticException e){
            System.out.println("Expection caught: " + e);
        }
    }
}