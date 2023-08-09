import java.util.*;
/**
 * factorial
 */
public class factorial_using_function {
    static int x;//number from user
    static Scanner sc = new Scanner(System.in);
    public static int fac(int a){
        int pro = 1;
        for(int i = 1;i<=a;i++){
            pro = pro*i;
        }
        return pro;
    }
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        x = sc.nextInt();
        System.out.println(fac(x));
    }
}