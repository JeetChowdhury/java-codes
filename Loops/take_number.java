import java.util.*;
/**
 * take_number
 */
public class take_number {
    static Scanner sc = new Scanner(System.in);
    static int n;

    public static void main(String[] args) {
        //int counter = 1;
        do {
            System.out.println("enter n :-");
            n = sc.nextInt();
            if (n/10!=0) {
                break;
            }
            else{
                System.out.println(n);
            }

        } while (true);
    }
}