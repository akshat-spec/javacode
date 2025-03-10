import java.util.*;
public class occurance {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number :  ");
        
        int n=sc.nextInt();
        System.out.println("Enter the number to check the occurance : ");
        int s =sc.nextInt();
        int count=0;
        while (n>0) {
            int rem =n%10;
            if (rem==s) {
                count++;
                
            }
            n=n/10;

            
        }
        System.out.println("The occurance of number "+ s +" is : "+count);
    }
}