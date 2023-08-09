import java.util.*;
/**
 * factorial
 */
public class factorial {
    static Scanner sc = new Scanner(System.in);
    static int a;
    static int fact;
    public static void main(String[] args) {
        System.out.println("Enter Your Number : ");
        a = sc.nextInt();
        fact = 1;
        for(int i = 1;i<=a;i++){
            fact *=i;
        }
        System.out.println(fact);
    }
}