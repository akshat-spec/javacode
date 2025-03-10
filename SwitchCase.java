import java.util.*;
/**
 * SwitchCase
 */
public class SwitchCase {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String n ;
        System.out.print("Enter the website  ");
        n=sc.nextLine();
        String ext=n.substring(n.lastIndexOf("."));
        switch (ext) {
            case ".com" : System.out.println("Commercial");
                
                break;
            case ".net": System.out.println("Netwrok");
                
                break;
            case ".org" : System.out.println("Organization");
                
                break;
            case ".in" : System.out.println("India");
                
                break;
            case ".usa": System.out.println("USA");
                
                break;
            
            case ".app" : System.out.println("Application");
                
                break;
            case ".gov" :  System.out.println("Government");
                
                break;
            default:
                 System.out.println("Invalid ext ");
                break;
        }{

        }
    }
}