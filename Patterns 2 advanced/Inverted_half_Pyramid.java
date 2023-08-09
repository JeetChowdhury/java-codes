import java.util.*;
public class Inverted_half_Pyramid {    
    static Scanner sc = new Scanner(System.in);
    static int x,y;
    public static void main(String[] args) {
        System.out.print("Enter The number : ");
        x = sc.nextInt();
        HalfPyramid(x);
    }
    public static void HalfPyramid(int totRows) {
        //outer loop
        for(int i = 1;i <= totRows;i ++ ) {       
            // Step 1[SPACE]
            for(int s = 1; s <= totRows - i; s++) {
                System.out.print(" ");
            }
            // Step 2 [STAR]
            for(int st = 1; st <= i; st++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
