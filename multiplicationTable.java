import java.util.*;
/**
 * multiplicationTable
 */
public class multiplicationTable {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for multipliacation table : ");
        int n =sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(i+"x"+n+"="+i*n);
            i++;

        }
    }
}
