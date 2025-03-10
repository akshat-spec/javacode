import java.util.*;
/**
 * Adding2Matrices
 */
public class Adding2Matrices {

    public static void main(String[] args) {
        
        int A[][]={{4,2,30},{5,8,6},{45,9,6}};
        int B[][]={{4,2,3},{1,8,6},{5,9,6}};
        int C[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                C[i][j]=A[i][j]+B[i][j];
            }

        }
        for(int x[]:C){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println("");

        }
    }
}
