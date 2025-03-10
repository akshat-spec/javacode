import java.util.*;
/**
 * regulareExpression
 */
public class regulareExpression {

    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        String str1 ="a";
        System.out.println(str1.matches("."));
        System.out.println(str1.matches("[abc]"));
        System.out.println(str1.matches("[abc]"));
        System.out.println(str1.matches("[^cvg]"));
        System.out.println(str1.matches("[a-z]"));
        System.out.println(str1.matches("//D"));
        System.out.println(str1.matches("//w"));
        System.out.println(str1.matches("//S"));
    }
}