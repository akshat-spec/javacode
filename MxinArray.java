import java.util.*;
/**
 * MxinArray
 */
public class MxinArray {
    static int IsMax(int A[]){
        int max= A[0];
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
                
            }

        }
        return max;

    }

    public static void main(String[] args) {
        int A[]={45,23,96,111};
        System.out.println(IsMax(A));
        
    }
}
