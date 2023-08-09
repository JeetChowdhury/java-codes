import java.util.*;
public class largest_of_3_numbers {
    static Scanner sc = new Scanner(System.in);
    static int a;
    static int b;
    static int c;
    public static void main(String[] args) {
        System.out.print("Enter 1st number : ");
        a = sc.nextInt();// 1st number 
        System.out.print("Enter 2nd number : ");
        b = sc.nextInt();// 2nd number 
        System.out.print("Enter 3rd number : ");
        c = sc.nextInt();// 3rd number
        if ((a>b)&&( a>c)) {// ! like AND truth table.If both side is true or 1, we will get true or 1 value.
            System.out.println(a);
        } else if (b>c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
