import java.util.*;
/**
 * TypeOfWebsite
 */
public class TypeOfWebsite {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String url,protocol;
        System.out.println("Enter the url");
        url =sc.nextLine();
        protocol=url.substring(0,url.indexOf(":"));
        System.out.println(protocol);
        if (protocol.equals("https")){
            System.out.println("Hyper Text Transfer Protocol ");

        }
        else if (protocol.equals("ftp")){
            System.out.println("File transfer protocol ");

        }
        else{
            System.out.println("URL not found .....");
        }
        String ext;
        ext=url.substring(url.lastIndexOf("."));
        if(ext.equals(".com")){
            System.out.println("commercial organization ");
        }
        else if(ext.equals(".org")){
            System.out.println("Non-profit organizations");
        }
        else if(ext.equals(".net")){
            System.out.println("network related website ");
        }
        else if(ext.equals(".edu")){
            System.out.println("Educational institutions");
        }
        else if(ext.equals(".blog")){
            System.out.println("Blogs and personal websites");
        }
        else if(ext.equals(".info")){
            System.out.println("Informational websites");
        }
        else {
            System.out.println("extention not found ...");
        }
        /*net: Network-related websites
.org: Non-profit organizations
.edu: Educational institutionds
.co: Companies and businesses
.info: Informational websites
.blog: Blogs and personal websites*/


    }
}