import java.util.*;
/**
 * Quadratic_equation
 */
public class Quadratic_equation {

    public static void main(String[] args) {
        System.out.println("ax^2 +bx+c is a quadratic equation ");
        System.out.println("enter the value of a , b, c  : ");
        Scanner sc =new Scanner(System.in);
        int a,b,c;
        double r1,r2;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        r1=-b+Math.sqrt(b*b-4*a*c)/2*a;
        r2=-b-Math.sqrt(b*b-4*a*c)/2*a;
        System.out.println("Root of the Quadratic equatin is : "+ r1 + " And "+ r2);
    }
}