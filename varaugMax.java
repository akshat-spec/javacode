import java.util.*;
/**
 * varaugMax
 */
public class varaugMax {
    static int max(int ... x){
        int max =0;
        for(int i=0;i<x.length;i++){
            if(x[i]>max){
                max=x[i];
            }
            
        }
        return max;
    }
    static int sum(int...y){
        int sum =0;
        for(int i=0;i<y.length;i++){
            sum=y[i]+sum;

        }
        return sum;

    }
    static double discount(double ... p){
        double sum =0;
        for(int i =0;i<p.length;i++){
            sum=p[i]+sum;
            if(sum<500){
                double disc=(10/sum)*100;
                sum=sum-disc;
            }
             else if (sum>500 && sum<5000){
                double disc=(25/sum)*100;
                sum=sum-disc;


            }
            else if (sum>5000){
                double disc=(50/sum)*100;
                sum=sum-disc;
                
            }
            else{
                System.out.println("sorry there is no dicount " );
                
            }

        }
        System.out.println("Price  with dicount is :");
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(max(4,56,89,11,23,45,63));
        System.out.println(sum(1,2,2,3));
        System.out.println(discount(42,85,56,85000));
    }
}