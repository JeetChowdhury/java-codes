import java.util.*;
public class even_odd {
    static Scanner sc = new Scanner(System.in);
    static int a;
    //static int b;
    public static void main(String[] args) {
        System.out.print("Enter n : ");
        a = sc.nextInt();// number taken from user
        if (a%2==0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
