import java.util.*;
import java.lang.*;

public class TriangleArea {
    public static void main(String[] args) {
        float s;
        double Area;
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of triangle");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        s = (a + b + c) / 2f;

        Area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of the triangle is : " + Area);
    }
}