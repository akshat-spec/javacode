import java.util.*;
/**
 * fibonacciWithoutRecur 
 */
 class fibonacciWithoutRecur {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for fibonacci series :  ");
        int n=sc.nextInt();
        int a=0,b=1,c;
        System.out.print(a+","+b+",");
        for (int i=0;i<=n-2;i++){
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
            

        }
    }

    
}