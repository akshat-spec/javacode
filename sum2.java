import java.util.*;
import java.lang.*;
class sum2{
    public static void main(String[]args){
        int a,b,c;
        float s;
        double Area;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sides of triangle");
        a= sc.nextInt();
        b= sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)/2f;

        Area=Math.sqrt(s*(s-a)*(s-b)*(s-b));
         System.out.println("Area of the tringle is : " + Area );


    }

}