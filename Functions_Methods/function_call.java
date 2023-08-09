import java.util.*;
public class function_call {
    static Scanner sc = new Scanner(System.in);
    static Scanner ac = new Scanner(System.in);
    static int n;
    static char a;
    public static void hw(){
        System.out.print("Enter Any number : ");
        n = sc.nextInt();
        System.out.println(n);
    }
    public static void main(String[] args) {
        a = ac.next().charAt(0);
        if (a=='y') {
            hw();
        } else {
            System.out.println("Invalid");
        }
        
    }
}
