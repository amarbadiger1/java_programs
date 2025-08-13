interface Reactangle{
    void areaOfRectangle(double length,double breadth);
}
interface Triangle{
    void areaOfTriangle(double base,double height);
}

public class jp7 implements Reactangle,Triangle{
    public void areaOfRectangle(double length,double breadth){
        System.out.println("Area of reactangle :" + (length*breadth));
    }
    public void areaOfTriangle(double base,double height){
        System.out.println("Area of Triangle :"+ (0.5*base*height));
    }
    public static void main(String args[]){
        jp7 ob=new jp7();
        ob.areaOfRectangle(3,4);
        ob.areaOfTriangle(5,3);
    }
}