import java.util.*;
/**
 * continue_1
 */
public class continue_1 {
    static Scanner sc = new Scanner(System.in);
    static int a;
    public static void main(String[] args) {
        for(;true;){
            System.out.print("enter your number : ");
            a = sc.nextInt();
            if (a%10==0) {
                continue;
            }
            System.out.println("Output : "+a);
        }
    }
}