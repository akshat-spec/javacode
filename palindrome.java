import java.util.*;
public class palindrome{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s =sc.nextLine();
        int n= s.length();
        StringBuilder s1=new StringBuilder();
        for( int i=n-1;i>=0;i--){
            s1.append(s.charAt(i));
        }
        String reverse = s1.toString();
        if(s.equals(reverse)){
            System.out.println("it is palindrome "+ reverse);
        }
        else{
            System.out.println("it is not palindrome ");
        }
        

        }
        
        
    
}