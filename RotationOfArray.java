import java.util.*;
/**
 * RotationOfArray
 */
public class RotationOfArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the Size of array :");
        n=sc.nextInt();
        System.out.println("Enter the element of Array :");
        int A[]= new int[n];
        for(i=0;i<n;i++){
            A[i]=sc.nextInt();


        }
        int temp=A[0];
        for(i=0;i<n;i++){
            A[i-1]=A[i];

        }
        A[A.length-1]=temp;
        for(int x:A){
            System.out.println(x+",");
        System.out.println("");

        }

    }
}