import java.util.*;
/**
 * AreaOverLOading
 */
public class AreaOverLOading {
    static int Area(int a,int b){
        int area=a*b;
        return area ;
    }
    static int Area(int a,int b,int c){
       int  s=(a+b+c)/2;

        int area=(int) Math.sqrt(s*(s-a)*(s-b)*(s-b));
        return area;
    }
    static int Area(int a){
        int area=a*a;
        return area;
    }

    public static void main(String[] args) {
        System.out.println("Area of Square : "+Area(7));
        System.out.println("Area of rectangle : "+Area(4, 5));
        System.out.println("Area of triange : "+Area(7, 5, 10));
        
    }
}