import java.util.*;
public class week_using_switch {
    static Scanner sc = new Scanner(System.in);
    static int n;
    public static void main(String[] args) {
        System.out.print("enter your day number : ");
        n = sc.nextInt();//take day number from user.
        switch (n) {
            case 1 : System.out.println("monday");
            break;
            case 2 : System.out.println("Tuesday");
            break;
            case 3 : System.out.println("wednesday");
            break;
            case 4 : System.out.println("thursday");
            break;
            case 5 : System.out.println("friday");
            break;
            case 6 : System.out.println("saturday");
            break;
            case 7 : System.out.println("sunday");
            break;
                       
            default:System.out.println("invalid");
                break;
        }
    }
}
