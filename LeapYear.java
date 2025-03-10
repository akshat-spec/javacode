import java.util.*;
/**
 * LeapYear
 */
public class LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter the year : ");
        year=sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("It is a leap year ...");

                }
                else{
                    System.out.println("It is not a leap year ...");
                }

                
            }
            else{
                System.out.println("It is  not a leap year ...");
            }

        }
        else{
            System.out.println("It is not a leap year ...");
        }
    }
}