import java.util.*;
/**
 * CountTheDigit 
 */
class CountTheDigit  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to display digit : ");
        int n=sc.nextInt();
        int count;
        count=0;
        while (n>0) {
            n=n/10;
            count ++;
            
        }
        System.out.println("Number of digit is = "+count);
    }


    
}
