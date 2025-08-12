// Write a Java program 
//  To find the area and circumference of the circle by accepting the radius 
// from the user.area= pi*r*r, circum=2*pi*r;
//  To accept a number and find whether the number is Prime or not

import java.util.*;
 public class jp3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double r=sc.nextDouble();
        double area=Math.PI*r;
        double circum=2*Math.PI*r;
        System.out.println("Area of the circle: "+ area);
        System.out.println("Circumference of the circle : "+ circum);

        System.out.println("Enter the number to check if it is prime: ");
        int n=sc.nextInt();
        boolean isprime=true;
        if(n<=1){
            isprime=false;
        }else{
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    isprime=false;
                    break;
                }
            }
        }

        if(isprime){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}