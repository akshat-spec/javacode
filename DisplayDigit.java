import java.util.*;
/**
 * DisplayDigit
 */
public class DisplayDigit {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n,r;
        System.out.println("Enter the number to display digit : ");
        n=sc.nextInt();
        
        while (n>0) {
            r=n%10;
            n=n/10;
            System.out.print(r);
            
        }
        
    }
}