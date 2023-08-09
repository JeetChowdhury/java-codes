import java.util.*;
/**
 * half_pyramid
 */
public class half_pyramid {
    static Scanner sc = new Scanner(System.in);
    static int n;
    public static void main(String[] args) {
        System.out.print("Enter Your number : ");
        n = sc.nextInt();
        for(int line = 1;line<=n;line++){
            for(int num = 1;num<=line;num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}