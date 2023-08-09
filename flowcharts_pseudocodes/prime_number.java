//! justify the given number is prime or not.
import java.util.*;
class prime_number{
    static Scanner sc = new Scanner(System.in);
    static int a;// number from user
    public static void main(String[] args) {
        System.out.print("enter your number which you wanna know prime or not :- ");
        a = sc.nextInt();// input from user
        boolean flag = false;
        int i = 2;
        while (i<a) {
            if (a%i==0) {
                flag = true;
                break;
            }
            i++;
        }
        if (flag== true) {
            System.out.println(a+" is not a prime number");
        }
        else{
            System.out.println(a+" is a prime number");
        }
    }
}
