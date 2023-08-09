import java.util.*;
public class Palindrome_Check {
    static Scanner sc = new Scanner(System.in);
    static int n;
    public static void main(String[] args) {
        System.out.print("enter your number : ");
        n = sc.nextInt();
        if (n == Palindrome(n)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    public static int Palindrome(int a){
        int Palindrome = 0;
        while (a>0) {
            int ld = a % 10;
            Palindrome = Palindrome * 10 + ld;
            a = a / 10;
        }
        return Palindrome;
        
    }
}
