import java.util.*;
/**
 * leap_year
 */
public class leap_year {
    static Scanner sc = new Scanner(System.in);
    static int year;
    public static void main(String[] args) {
        System.out.print("Enter Your year : ");
        year = sc.nextInt();
        if (year%100==0 && year%400==0) {// ! like AND truth table.If both side is true or 1, we will get true or 1 value.
            System.out.println("leap year");
        } else if (year%100!=0 && year%4==0) {// ! like AND truth table.If both side is true or 1, we will get true or 1 value.
            System.out.println("Leap Year");
        } else{
            System.out.println("not leap year.");
        }
    }
}