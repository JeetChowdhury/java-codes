import java.util.*;
public class Adult_NotAdult_using_ternaryOperator {
    static Scanner sc = new Scanner(System.in);
    static int age;
    public static void main(String[] args) {
        System.out.print("Enter your age : ");
        age = sc.nextInt();//@ age of user.
        String o = (age>=18)? "Adult":"Not Adult";//? condition in one line with result.
        System.out.println(o);
    }
}
