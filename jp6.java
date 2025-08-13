public class jp6{
    private int a;
    private int b;

    public jp6(){
        a=0;
        b=0;
        System.out.println("Default Construtor Called");
    }
    public jp6(int x){
        a=x;
        b=0;
        System.out.println("construtor with one parameter");
    }
    public jp6(int x,int y){
        a=x;
        b=y;
        System.out.println("Construtor with two parameter");
    }

    public void add(){
        System.out.println("Sum (no arg) : " + (a+b));
    }
    public void add(int x){
        System.out.println("Sum (using one arg) : " + (a+b+x));
    }
    public void add(int x,int y){
        System.out.println("Sum (using two arg) : " + (a+b+x+y));
    }
    public static void main(String args[]){
        jp6 ob1=new jp6();
        jp6 ob2=new jp6(6);
        jp6 ob3=new jp6(6,4);
        ob1.add();
        ob2.add(2);
        ob3.add(2,3);

    }
}