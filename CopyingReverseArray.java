import java.util.*;
/**
 * CopyingReverseArray
 */
public class CopyingReverseArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A[]= {45,56,89,2,3,5};
        int B[]=new int[6];
        for(int i=5, j=0;i>=0;i--,j++){
            B[j]=A[i];

        }
        for(int x:B){
            System.out.print(x+",");
        }
        
        
    }
}
