import java.util.*;
class Q_on_regularexpression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find binary or not : ");
        int b= sc.nextInt();
        String str = String.valueOf(b);
        System.out.println(str.matches("[01]*"));
        System.out.println(str.matches("[0-9A-F]+"));
        System.out.println(str.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
    }

    
}
// Program shi h compilation error h bsss.....