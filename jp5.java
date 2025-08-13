// Write a Java program to implement Inner class and demonstrate its Access 
// protection.
public class jp5{
    private String om = "Hello From outer class";

    class InnerClass{
        void display(){
            System.out.println("Accessing OuterMessage " + om);
        }
    }
    
    
    public static void main(String args[]){
        jp5 outer=new jp5();
        jp5.InnerClass inner=outer.new InnerClass();
        inner.display();
    }
}