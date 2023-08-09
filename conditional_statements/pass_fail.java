import java.util.*;
public class pass_fail {
    static Scanner sc = new Scanner(System.in);
    static int a;
    //static int b;

    public static void main(String[] args) {
        System.out.print("Enter your number : ");
        a = sc.nextInt();
        if (a>=35) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}
