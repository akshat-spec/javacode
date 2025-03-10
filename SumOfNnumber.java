import java.util.*;
/**
 * SumOfNnumber
 */
public class SumOfNnumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be sum :  ");
        int i,n,sum;
        n=sc.nextInt();
        sum=0;

        for(i=1;i<=n;i++){
            
            sum=sum+i;
        }
        System.out.println("sum of "+n+" is : "+sum);
    }
}