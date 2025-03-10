import java.util.*;
/**
 * ArmstrongNumber
 */
public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number to check Armstrong number = ");
        int n =sc.nextInt();
        int sum=0 ,r,m=n ;
        while(n>0){
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;
    
            
        }
        System.out.println(sum);
        if (m==sum) {
            System.out.println("Yes, This number is armstrong number ....");

            
        }
        else{
            System.out.println("NO, This is not a armstrong number...");
        }
    }

}
