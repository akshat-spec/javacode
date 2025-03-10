import java.util.*;
 class rectangle {

    private double length;
    private double breath;
    public double getLength(){
        return length;

    }
    public double getBreath(){
        return breath;

    }
    public void setLength(int l){
        if(l<0){
            length=0;
        }
        else
        length=l;
    }
    public void setBreath(int b){
        if(b<0){
            breath=0;
        }
        else
        breath=b;
    }
 
    public double area()
    {
        return length*breath;
        
    }
    public double perimeter (){
        return 2*(length+breath);
    }
    public boolean isSquare(){
        if(length==breath)
        return true ;
        else 
        return false;

}
public class irectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rectangle r1 = new rectangle();
        r1.setLength(45);
        r1.setBreath(56);

        System.out.println("Area = "+r1.area());
    }
}
 }

    
