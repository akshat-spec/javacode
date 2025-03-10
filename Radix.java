import java.util.*;

import javax.sound.midi.Soundbank;
/**
 * Radix
 */
public class Radix {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number :  ");
        String num;
        num=sc.nextLine();
        if(num.matches("[01]+")){
            System.out.println(num+ "  = Number is binary , Radix : 2");

        }
        else if (num.matches("[1-7]*")) {
            System.out.println(num+"  = NUmber is Octal , Radix : 8");
            
        }
        else if (num.matches("[0-9A-F]*")){
            System.out.println(num+"  = Number is Hexadecimal , Radix : 16");

        }
        else if(num.matches("[0-9]*")){
            System.out.println(num+"  = Number is Decimal , Radix : 10");

        }
        else{
            System.out.println("invalid digits ...");
        }
        
        
        {

        }
    }
}
