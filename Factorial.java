import java.util.*;
/**
 * Factorial
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for Factorial : ");
        int i,n,fact;
        n=sc.nextInt();
        fact=1;
        for(i=1;i<=n;i++){
            fact=fact*i;

        }
        System.out.println(fact);
    }
}