import java.util.*;
/**
 * OldAndYoung
 */
public class OldAndYoung {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your Age  ");
        age=sc.nextInt();
        if(age<0){
            System.out.println("Invalid age ... ");

        }
        else if(age<14){
            System.out.println("You are child ");
        }
        else if (age>=14 && age<=55) {
            System.out.println("You are young ");

            
        }
        else if(age>55){
            System.out.println("You are old");

        }
        
    }
}