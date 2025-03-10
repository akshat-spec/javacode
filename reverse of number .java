import java.util.*;
public class reversenumber  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reverse : ");
        int num =sc.nextInt();
        int ans=0;
        while (num>0) {
            int revr=num%10;
            num/=10;
            ans=ans*10+revr;
            
        }
        System.out.println("reverse  is equal to :" + ans);
    }


}