import java.util.*;
/**
 * break_keyword
 */
public class break_keyword {
    static Scanner sc = new Scanner(System.in);
    static int n;
    public static void main(String[] args) {
        //using 'do while loop'
        // do {
        //     n = sc.nextInt();
        //     if (n%10==0) {
        //         break;
        //     }
        //     System.out.println(n);
        // } while (true);

        
        // using only 'while loop'
        while (true) {
            n = sc.nextInt();
            if (n%10==0) {
                System.out.println(n);
                break;
            }
            System.out.println(n);
        }
        //using only 'for loop'
        // for(;true;){
        //     n = sc.nextInt();
        //     if (n%10==0) {
        //         System.out.println(n);
        //         break;
                
        //     }
        //     System.out.println(n);
        // }
    }
}