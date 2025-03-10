import java.util.*;

// V = πr2h ,p=4r + 2h
class cyclinder{
    public double radius;
    public double height;
    public char[] volume;
    public char[] perimeter;
    public char[] area;
    public double area(){
        return 2*Math.PI*radius*height+(2*Math.PI*radius*radius);
    }
    public double volume(){
        return Math.PI*radius*2*height;
    }
    public double perimeter(){
        return 4*radius+2*height;
    }

    
}
public class cyclinder1{
    public static void main(String args[]){
        cyclinder c =new cyclinder();
        c.radius=54;
        c.height=89;
        System.out.println(c.area);
        System.out.println(c.perimeter);
        System.out.println(c.volume);
    }
}