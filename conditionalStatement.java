import java.util.Scanner;

/**
 * conditionalStatement
 */
public class conditionalStatement {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three number : ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        //finding largest no. 
        if(a>b&&a>c){
            System.out.println(a+" is greater then  : "+b+" and "+ c);
        }
        else if (b>c) {
            System.out.println(c+" is greater than "+a+" and "+b);

            
        }
        else{
            System.out.println(c+" is greater than "+b+" and "+a);
        }
    }
}