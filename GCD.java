import java.util.*;
/**
 * GCD
 */
public class GCD {
    static int isGCD(int n,int m){
        while(n!=m){
            if(m>n)
            m=m-n;
            else 
            n=n-m;
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println(isGCD(5, 15));
        
    }
}