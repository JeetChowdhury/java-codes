//! Find maximum number from given three numbers.
import java.util.*;
public class find_max_num {
     public static void main(String[] args) {
         try (Scanner aa = new Scanner(System.in)) {
            // Scanner ab = new Scanner(System.in);
            // Scanner ac = new Scanner(System.in);
            int a = aa.nextInt();
            int b = aa.nextInt();
            int c = aa.nextInt();
            if (a>b) {
                if (a>c) {
                    System.out.println(a+",largest");
                }
                else{
                    System.out.println(c+ ",largest");
                }
            }
            else{
                if(b>c){
                    System.out.println(b+", largest");

                }
                else{
                    System.out.println(c+",largest");
                }
            }
        }
    }
}