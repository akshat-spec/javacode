import java.util.*;
class MenuDriven{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number : ");
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        sc.nextLine();
        String choice;
        System.out.println("Enter ADD to addition \n Enter SUB to subtraction \n Enter MUL to multiplication \n Enter DIV to division ");
        choice =sc.nextLine();
        choice=choice.toUpperCase();
        switch (choice) {
            case "ADD":System.out.println(a+b);
                
                break;
            case "SUB":System.out.println(a-b);
                
                break;
            case "MUL":System.out.println(a*b);
                
                break;
            case "DIV":System.out.println(a/b);
                
                break;
            
            default:System.out.println("INvalid out put ");
                break;
        }

    }
}