import java.util.*;
class students{
    public int roll;
    public String name;
    public String course;
    public double m1 ,m2,m3;
    
    public int Total(){
        return (int) (m1+m2+m3);

    }
    public float Avg(){
        return (float)(m1+m2+m3)/3;
    }
    public char grade(){
        if(Avg()>=60)
        return 'A';
        else
        return 'B';
    }




}
