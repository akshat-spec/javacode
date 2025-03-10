import java.util.*;
/**
 * gmail_finder
 */
public class gmail_finder {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str,username,domain ;
        System.out.println("Enter the gmail addresss with the formate of : xyz@gmail.com");
        str=sc.nextLine();
       //str ="akshat@gmail.com";
       int i= str.indexOf("@");
       username=str.substring(0,i);
       domain=str.substring(i+1,str.length());
       System.out.println("Username : "+username);
       System.out.println("Domain : "+domain);
       System.out.println(domain.startsWith("gmail.com"));
       

    }
}