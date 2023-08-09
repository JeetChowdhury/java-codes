import java.util.*;
public class prime_not_prime {
    static Scanner sc = new Scanner(System.in);
    static int n;//number taken by user
    static boolean flag;// to undstand the number is divisable or not.
    public static void main(String[] args) {
        flag = false;
        System.out.print("Enter your number : ");
        n = sc.nextInt();
        int i = 2;
        while (i<n) { 
            if(n%i==0){
                flag = true;
                System.out.println("Divided by "+i);
            }
            i++;
        }
        if (flag==true) {
            System.out.println("That's why,this is not a prime number.");
        } else {
            System.out.println("this is a prime number.");
        }
    }
}
