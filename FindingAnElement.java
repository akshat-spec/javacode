import java.util.*;

import javax.sound.midi.Soundbank;
/**
 * FindingAnElement
 */
public class FindingAnElement {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n= sc.nextInt();
        int A[]= new int[n];
        System.out.println("Enter the element in array ");
        for(int i=0;i<=n-1;i++){
             A[i]=sc.nextInt();

        }
        int sum =0;
        for(int i=0;i<A.length;i++){
            sum=sum+A[i];


        }
        int item;
        System.out.println("ENter th elemnet to be searched  ");
        item =sc.nextInt();
        for(int i=0;i<n;i++){
            if(A[i]==item){
                System.out.println("Element found");

            }
            System.exit(0);
        }
        
                

            }
            
            
               
            
            
        
    }

