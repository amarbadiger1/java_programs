/*2)Write a Java program to list the factorial of the 
numbers 1 to 10. To calculate the factorial value, 
use while loop.(Hint Fact of 4 = 4*3*2*1)*/
// public class jp2{
//     public static void main(String args[]){
//         for(int i=1;i<=10;i++){
//             int res = 1;
//             for(int j=1;j<=i;j++){
//                 res=res*j;  
//             }
//             System.out.println(res+" ");  
//         }
//     }
// }

// using while loop 
public class jp2{
    public static void main(String args[]){
        int i=1;
        while(i<=10){
            int res=1;
            int j=1;
            while(j<=i){
                res=res*j;
                j++;
            }
            System.out.println("Factorial of " + i + " is " + res);
            i++;
        }
    }
}